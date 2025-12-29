package com.example.demo.service.impl;

import com.example.demo.model.AlertNotification;
import com.example.demo.repository.AlertNotificationRepository;
import com.example.demo.service.AlertNotificationService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // ⭐ REQUIRED — THIS CREATES THE BEAN
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private final AlertNotificationRepository repository;

    public AlertNotificationServiceImpl(AlertNotificationRepository repository) {
        this.repository = repository;
    }

    @Override
    public AlertNotification createAlert(AlertNotification alert) {
        return repository.save(alert);
    }

    @Override
    public List<AlertNotification> getAllAlerts() {
        return repository.findAll();
    }

    @Override
    public AlertNotification getAlertById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Alert not found with id " + id));
    }

    @Override
    public void deleteAlert(Long id) {
        repository.deleteById(id);
    }
}
