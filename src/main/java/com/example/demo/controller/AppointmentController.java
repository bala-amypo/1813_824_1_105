package com.example.demo.controller;
import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class AppointmentController{
    @Autowired
    AppointmenService obj;
    @PostMapping
    public Appointment Appoint(@RequestBody Appointment appointment){
     return obj.createAppointment(appointment);
    }
    
}