package com.example.demo.controller;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/appointments")
    public Appointment create(@RequestParam Long visitorId,
                              @RequestParam Long hostId,
                              @RequestBody Appointment appointment) {
        return appointmentService.createAppointment(visitorId, hostId, appointment);
    }

    @GetMapping("/appointments/{id}")
    public Appointment get(@PathVariable Long id) {
        return appointmentService.getAppointment(id);
    }

    @GetMapping("/appointments/host/{hostId}")
    public List<Appointment> byHost(@PathVariable Long hostId) {
        return appointmentService.getAppointmentsForHost(hostId);
    }

    @GetMapping("/appointments/visitor/{visitorId}")
    public List<Appointment> byVisitor(@PathVariable Long visitorId) {
        return appointmentService.getAppointmentsForVisitor(visitorId);
    }
}
