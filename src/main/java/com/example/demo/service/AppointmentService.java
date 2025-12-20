package com.example.demo.service;
import com.example.demo.model.Appointment;
public interface AppointmentService{
    Appointment createAppoinment(Long visitorId,Long hostId,Appointment appointment);
    Appointment getAppointment(Long id);
    List<Appointment> getAppointmentsForHost(Long hostId);
    List<Appointment> getAppointmentsForVisitor(Long visitorId); 
}