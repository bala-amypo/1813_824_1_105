package com.example.demo.service;
import jakarta.persistence.Service;
import com.example.demo.model.Appointment;
@Service
public interface AppointmentService{
    public Appointment createAppoinment(Long visitorId,Appointment appointment);
    public Appointment getAppointment(Long id);
    public Appointment getAppointmentsForHost(Long hostId);
    public Appointment getAppointmentsForVisitor 
}