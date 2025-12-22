package com.example.demo.controller;
import com.example.demo.service.AlertNotificationService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.AlertNotification;
import java.util.List;
@RestController
@RequestMapping("/alertnotification")
public class AlertNotificationController{
    @Autowired
    AlertNotificationService obj;
    @PostMapping
    public AlertNotification Hostcontrler(@RequestBody Host host){
        return obj.createH(host);
    }
    @GetMapping("/{id}")
    public Host Hostcontr(@PathVariable Long id){
        return obj.getHost(id);
    }
    @GetMapping
    public List<Host> getHost(){
        return obj.getAllHost();
    }


}