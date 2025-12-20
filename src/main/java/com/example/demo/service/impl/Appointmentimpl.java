package com.example.demo.service.impl;
import com.example.demo.controller.AppointmentController;
import com.example.demo.model.Appointment;
import org.springframework.stereotype.Service;
import com.example.demo.service.AppointmentService;
import java.util.List;
@Service
public class Appointmentimpl implements AppointmentService{
    @Autowired
    @Appointmentrepository obj;
    public Appointment createAppointment(Long visitorId,Long hostId,Appointment appointment){
        appointment.setVisitorId(visitorId);
        appointment.setHostId(hostId);
        return obj.save(appointment);
    }
    public Appointment getAppointment(Long id){
        return obj.findByTd(id).orElse(null);
    }
    public List<Appointment> getAppointmentForHost(Long hostId){
        return obj.findByHostId(hostId);

    }
    public List<Appointment> getAppointmentForVisitor(Long VisitorId){
        return obj.findByVisitorId(visitorId);
    }
}