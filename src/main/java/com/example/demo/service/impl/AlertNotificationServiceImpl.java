package com.example.demo.service.impl;

import com.example.demo.service.AlertNotificationService;
import org.springframework.stereotype.Service;

@Service   // 🔥 THIS IS MANDATORY
public class AlertNotificationServiceImpl implements AlertNotificationService {

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert sent: " + message);
    }
}
