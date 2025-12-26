package com.example.demo.controller;

import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlertNotificationController {

    private AlertNotificationService alertService;

    public AlertNotificationController(AlertNotificationService alertService) {
        this.alertService = alertService;
    }

    @PostMapping("/alerts/{visitLogId}")
    public AlertNotification send(@PathVariable Long visitLogId) {
        return alertService.sendAlert(visitLogId);
    }

    @GetMapping("/alerts/{id}")
    public AlertNotification get(@PathVariable Long id) {
        return alertService.getAlert(id);
    }

    @GetMapping("/alerts")
    public List<AlertNotification> all() {
        return alertService.getAllAlerts();
    }
}
