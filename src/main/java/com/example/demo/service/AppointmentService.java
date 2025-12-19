package com.example.demo.service;
import com.example.demo.model.Appointment;
import 
public interface AppointmentService{
    public Appointment createAppoinment(Long visitorId,Appointment appointment);
    public Appointment getAppointment(Long id);
    public Appointment getAppointmentsForHost(Long hostId);
    public Appointment getAppointmentsForVisitor(Long visitorId); 
}