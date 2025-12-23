package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
@RestController
@RequestMapping("alerts")
public class AlertNotificationController {
    @Autowired
    private AlertNotificationService service;
    @PostMapping
    public AlertNotification sendAlert(
            @RequestBody AlertNotification alert) {
        return service.sendAlert(visitLogId);
    }
    @GetMapping("/{id}")
    public AlertNotification getAlert(@PathVariable Long id) {
        return service.getAlert(id);
    }
    @GetMapping
    public List<AlertNotification> getAllAlerts() {
        return service.getAllAlerts();
    }
}
