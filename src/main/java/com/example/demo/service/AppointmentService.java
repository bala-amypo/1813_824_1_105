package com.example.demo.service;
import com.example.demo.model.Appointment;
public interface AppointmentService{
    Appointment createAppoinment(Long visitorId,Appointment appointment);
    Appointment getAppointment(Long id);
    Appointment getAppointmentsForHost(Long hostId);
    Appointment getAppointmentsForVisitor(Long visitorId); 
}