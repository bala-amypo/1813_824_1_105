package com.example.demo.service.impl;
import com.example.demo.repository.Appointmentrepository;
import com.example.demo.model.Appointment;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.AppointmentService;
import java.util.List;
@Service
public class Appointmentimpl implements AppointmentService{
    @Autowired
    Appointmentrepository obj;
    public Appointment createAppointment(Long visitorId,Long hostId,Appointment appointment){
        appointment.setVisitor(visitorId.toString());
        appointment.setHost(hostId.toString());
        return obj.save(appointment);
    }
    public Appointment getAppointment(Long id){
        return obj.findById(id).orElse(null);
    }
    public List<Appointment> getAppointmentsForHost(Long hostId){
        return obj.findByHost(hostId.toString());

    }
    public List<Appointment> getAppointmentsForVisitor(Long visitorId){
        return obj.findByVisitor(visitorId.toString());
    }
}