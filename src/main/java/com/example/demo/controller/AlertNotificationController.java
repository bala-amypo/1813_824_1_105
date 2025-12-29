package com.example.demo.controller;

import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertNotificationController {

    private AlertNotificationService alertService;

    public AlertNotificationController(AlertNotificationService service) {
        this.alertService = service;
    }

    @PostMapping("/send/{visitLogId}")
    public AlertNotification sendAlert(@PathVariable Long visitLogId) {
        return alertService.sendAlert(visitLogId);
    }

    @GetMapping("/{id}")
    public AlertNotification getAlert(@PathVariable Long id) {
        return alertService.getAlert(id);
    }

    @GetMapping
    public List<AlertNotification> getAllAlerts() {
        return alertService.getAllAlerts();
    }
}
