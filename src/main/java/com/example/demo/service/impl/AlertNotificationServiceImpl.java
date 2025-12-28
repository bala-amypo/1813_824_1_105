package com.example.demo.service.impl;

import com.example.demo.model.AlertNotification;
import com.example.demo.repository.AlertNotificationRepository;
import com.example.demo.service.AlertNotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private final AlertNotificationRepository alertRepository;

    public AlertNotificationServiceImpl(AlertNotificationRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    @Override
    public AlertNotification createAlert(AlertNotification alert) {
        return alertRepository.save(alert);
    }

    @Override
    public List<AlertNotification> getAllAlerts() {
        return alertRepository.findAll();
    }
}
