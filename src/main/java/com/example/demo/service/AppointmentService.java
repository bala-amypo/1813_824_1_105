package com.example.demo.service;

import com.example.demo.model.Appointment;
import java.util.List;

public interface AppointmentService {
    Appointment createAppointment(Long vId, Long hId, Appointment a);
    Appointment getAppointment(Long id);
    List<Appointment> getAppointmentsForHost(Long id);
    List<Appointment> getAppointmentsForVisitor(Long id);
}
