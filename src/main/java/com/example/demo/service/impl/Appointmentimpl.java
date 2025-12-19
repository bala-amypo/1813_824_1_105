package com.example.demo.service.impl;
import com.example.demo.controller.AppointmentController;
import com.example.demo.model.Appointment;
import org.springframework.stereotype.Service;
import com.example.demo.service.AppointmentService;
@Service
public class Appointmentimpl implements AppointmentService{
    @Autowired
    @Appointmentrepository obj;
    public Appointment createAppointment(Long visitorId,Long hostId,Appointment appointment){
        return obj
    }
}