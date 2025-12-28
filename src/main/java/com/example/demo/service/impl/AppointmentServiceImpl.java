package com.example.demo.service.impl;

import com.example.demo.model.Appointment;
import com.example.demo.model.Visitor;
import com.example.demo.model.Host;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.repository.HostRepository;
import com.example.demo.service.AppointmentService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;
    private VisitorRepository visitorRepository;
    private HostRepository hostRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, VisitorRepository visitorRepository, HostRepository hostRepository){
        this.appointmentRepository = appointmentRepository;
        this.visitorRepository = visitorRepository;
        this.hostRepository = hostRepository;
    }

    @Override
    public Appointment createAppointment(Long visitorId, Long hostId, Appointment ap) {
        Visitor v = visitorRepository.findById(visitorId).orElseThrow();
        Host h = hostRepository.findById(hostId).orElseThrow();
        if(ap.getAppointmentDate().isBefore(LocalDate.now())){
            throw new IllegalArgumentException("appointmentDate cannot be past");
        }
        ap.setVisitor(v);
        ap.setHost(h);
        if(ap.getStatus() == null) ap.setStatus("SCHEDULED");
        return appointmentRepository.save(ap);
    }

    @Override
    public Appointment getAppointment(Long id) {
        return appointmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Appointment not found"));
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
