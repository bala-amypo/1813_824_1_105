package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.AppointmentService;

import java.time.LocalDate;
import java.util.List;

public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;
    private VisitorRepository visitorRepository;
    private HostRepository hostRepository;

    public AppointmentServiceImpl(AppointmentRepository a, VisitorRepository v, HostRepository h) {
        this.appointmentRepository = a;
        this.visitorRepository = v;
        this.hostRepository = h;
    }

    @Override
    public Appointment createAppointment(Long visitorId, Long hostId, Appointment appointment) {

        if (appointment.getAppointmentDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("appointmentDate cannot be past");
        }

        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));

        Host host = hostRepository.findById(hostId)
                .orElseThrow(() -> new RuntimeException("Host not found"));

        appointment.setVisitor(visitor);
        appointment.setHost(host);
        appointment.setStatus("SCHEDULED");

        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment getAppointment(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
    }

    @Override
    public List<Appointment> getAppointmentsForHost(Long hostId) {
        return appointmentRepository.findByHostId(hostId);
    }

    @Override
    public List<Appointment> getAppointmentsForVisitor(Long visitorId) {
        return appointmentRepository.findByVisitorId(visitorId);
    }
}
