package com.example.demo.controller;

import com.example.demo.service.AlertNotificationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alerts")
public class AlertNotificationController {

    private final AlertNotificationService alertNotificationService;

    
    public AlertNotificationController(AlertNotificationService alertNotificationService) {
        this.alertNotificationService = alertNotificationService;
    }

    @PostMapping("/send")
    public String sendAlert(@RequestParam String message) {
        alertNotificationService.sendAlert(message);
        return "Alert sent successfully";
    }
}
