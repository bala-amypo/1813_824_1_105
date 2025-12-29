package com.example.demo.controller;

import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
@SecurityRequirement(name = "BearerAuth")
public class AlertNotificationController {

    private final AlertNotificationService alertService;

    public AlertNotificationController(AlertNotificationService alertService) {
        this.alertService = alertService;
    }

    @PostMapping
    public AlertNotification create(@RequestBody AlertNotification alert) {
        return alertService.createAlert(alert);
    }

    @GetMapping
    public List<AlertNotification> getAll() {
        return alertService.getAllAlerts();
    }

    @GetMapping("/{id}")
    public AlertNotification getById(@PathVariable Long id) {
        return alertService.getAlertById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        alertService.deleteAlert(id);
        return "Alert deleted successfully";
    }
}
