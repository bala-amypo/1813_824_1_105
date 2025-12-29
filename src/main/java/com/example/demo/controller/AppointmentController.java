package com.example.demo.controller;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService service) {
        this.appointmentService = service;
    }

    @PostMapping("/{vId}/{hId}")
    public Appointment createAppointment(@PathVariable Long vId,
                                         @PathVariable Long hId,
                                         @RequestBody Appointment a) {
        return appointmentService.createAppointment(vId, hId, a);
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable Long id) {
        return appointmentService.getAppointment(id);
    }

    @GetMapping("/host/{id}")
    public List<Appointment> getForHost(@PathVariable Long id) {
        return appointmentService.getAppointmentsForHost(id);
    }

    @GetMapping("/visitor/{id}")
    public List<Appointment> getForVisitor(@PathVariable Long id) {
        return appointmentService.getAppointmentsForVisitor(id);
    }
}
