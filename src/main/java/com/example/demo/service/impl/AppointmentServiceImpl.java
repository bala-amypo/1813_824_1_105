package com.example.demo.service.impl;

import com.example.demo.model.Appointment;
import com.example.demo.repository.*;
import com.example.demo.service.AppointmentService;
import java.time.LocalDate;
import java.util.List;

public class AppointmentServiceImpl implements AppointmentService {

    public AppointmentRepository appointmentRepository;
    public VisitorRepository visitorRepository;
    public HostRepository hostRepository;

    public AppointmentServiceImpl() {}

    public AppointmentServiceImpl(AppointmentRepository a,
                                  VisitorRepository v,
                                  HostRepository h) {
        this.appointmentRepository = a;
        this.visitorRepository = v;
        this.hostRepository = h;
    }

    public Appointment createAppointment(Long vId, Long hId, Appointment a) {
        if (a.getAppointmentDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "appointmentDate cannot be past");
        }
        visitorRepository.findById(vId)
                .orElseThrow(() ->
                        new RuntimeException("Visitor not found"));
        hostRepository.findById(hId)
                .orElseThrow(() ->
                        new RuntimeException("Host not found"));

        if (a.getStatus() == null) {
            a.setStatus("SCHEDULED");
        }
        return appointmentRepository.save(a);
    }

    public Appointment getAppointment(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Appointment not found"));
    }

    public List<Appointment> getAppointmentsForHost(Long id) {
        return appointmentRepository.findByHostId(id);
    }

    public List<Appointment> getAppointmentsForVisitor(Long id) {
        return appointmentRepository.findByVisitorId(id);
    }
}
