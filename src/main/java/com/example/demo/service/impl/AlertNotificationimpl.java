package com.example.demo.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.AlertNotification;
import com.example.demo.repository.AlertNotificationrepository;
import com.example.demo.service.AlertNotificationService;
@Service
public class AlertNotificationimpl implements AlertNotificationService {
    @Autowired
    AlertNotificationrepository obj;
    public AlertNotification sendAlert(Long visitLogId) {
        AlertNotification alert = new AlertNotification();
        alert.setVisitLogId(visitLogId);
        alert.setMessage("New alert");
        alert.setCreatedAt(LocalDateTime.now());
        return obj.save(alert);
    }

    public AlertNotification getAlert(Long id) {
        return obj.findById(id)
                .orElseThrow(() -> new RuntimeException("Alert not found"));
    }
    public List<AlertNotification> getAllAlert() {
        return obj.findAll();
    }
}