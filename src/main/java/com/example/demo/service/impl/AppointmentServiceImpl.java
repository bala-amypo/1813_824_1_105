package com.example.demo.service.impl;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.model.Appointment;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.AppointmentService;
import java.util.List;
import java.time.LocalDate;
import com.example.demo.model.Host;
import com.example.demo.model.Visitor;
import com.example.demo.repository.HostRepository;
import com.example.demo.repository.VisitorRepository;

@Service
public class AppointmentServiceImpl {

    private AppointmentRepository appointmentRepository;
    private VisitorRepository visitorRepository;
    private HostRepository hostRepository;

    public AppointmentServiceImpl(AppointmentRepository a, VisitorRepository v, HostRepository h) {
        this.appointmentRepository = a;
        this.visitorRepository = v;
        this.hostRepository = h;
    }

    public Appointment createAppointment(Long visitorId, Long hostId, Appointment ap) {
        if (ap.getAppointmentDate().isBefore(LocalDate.now()))
            throw new IllegalArgumentException("appointmentDate cannot be past");

        Visitor v = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
        Host h = hostRepository.findById(hostId)
                .orElseThrow(() -> new RuntimeException("Host not found"));

        ap.setVisitor(v);
        ap.setHost(h);
        ap.setStatus("SCHEDULED");

        return appointmentRepository.save(ap);
    }

    public Appointment getAppointment(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
    }

    public List<Appointment> getAppointmentsForHost(Long hostId) {
        return appointmentRepository.findByHostId(hostId);
    }

    public List<Appointment> getAppointmentsForVisitor(Long visitorId) {
        return appointmentRepository.findByVisitorId(visitorId);
    }
}