package com.example.demo.controller;
import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@RestController
@RequestMapping("/visitLog")
public class VisitLogController{
    @Autowired
    VisitLogService obj;
    @PostMapping("/{visitorId}/{hostId}")
    public Appointment Appoint(@PathVariable Long visitorId,@PathVariable Long hostId,@RequestBody Appointment appointment){
     return obj.createAppointment(visitorId,hostId,appointment);
    }
    @GetMapping("/host/{hostId}")
    public List<Appointment> hello(@PathVariable Long hostId){
        return obj.getAppointmentsForHost(hostId);
    }
    @GetMapping("/visitor/{visitorId}")
    public List<Appointment> hello1(@PathVariable Long visitorId){
        return obj.getAppointmentsForVisitor(visitorId);
    }
    @GetMapping("/{id}")
    public Appointment Appoint(@PathVariable Long id){
        return obj.getAppointment(id);
    }
}