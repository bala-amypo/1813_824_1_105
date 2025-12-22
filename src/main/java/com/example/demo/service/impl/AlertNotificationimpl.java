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
    private AlertNotificationRepository obj;

    @Override
    public AlertNotification sendAlert(Long visitLogId) {

        AlertNotification alert = new AlertNotification();

        alert.setVisitLog(String.valueOf(visitLogId)); // convert Long → String
        alert.setAlertMessage("New alert");
        alert.setSentAt(LocalDateTime.now());

        return obj.save(alert);
    }

    @Override
    public AlertNotification getAlert(Long id) {
        return obj.findById(id)
                .orElseThrow(() -> new RuntimeException("Alert not found"));
    }

    @Override
    public List<AlertNotification> getAllAlert() {
        return obj.findAll();
    }
}
