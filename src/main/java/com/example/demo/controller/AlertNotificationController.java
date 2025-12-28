package com.example.demo.controller;

import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertNotificationController {

    private final AlertNotificationService alertService;

    public AlertNotificationController(AlertNotificationService alertService) {
        this.alertService = alertService;
    }

    @PostMapping
    public ResponseEntity<AlertNotification> createAlert(@RequestBody AlertNotification alert) {
        AlertNotification createdAlert = alertService.createAlert(alert);
        return ResponseEntity.ok(createdAlert);
    }

    @GetMapping
    public ResponseEntity<List<AlertNotification>> getAllAlerts() {
        List<AlertNotification> alerts = alertService.getAllAlerts();
        return ResponseEntity.ok(alerts);
    }
}
