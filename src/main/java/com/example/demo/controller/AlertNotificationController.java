package com.example.demo.controller;

import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertNotificationController {

    private final AlertNotificationService alertNotificationService;

    public AlertNotificationController(AlertNotificationService alertNotificationService) {
        this.alertNotificationService = alertNotificationService;
    }

    @PostMapping("/send")
    public AlertNotification sendAlert(@RequestParam Long visitLogId) {
        return alertNotificationService.sendAlert(visitLogId);
    }

    @GetMapping("/{id}")
    public AlertNotification getAlert(@PathVariable Long id) {
        return alertNotificationService.getAlert(id);
    }

    @GetMapping
    public List<AlertNotification> getAllAlerts() {
        return alertNotificationService.getAllAlerts();
    }
}
