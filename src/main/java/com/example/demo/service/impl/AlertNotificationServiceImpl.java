package com.example.demo.service.impl;

import com.example.demo.model.AlertNotification;
import com.example.demo.model.VisitLog;
import com.example.demo.repository.AlertNotificationRepository;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.AlertNotificationService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private final AlertNotificationRepository alertRepository;
    private final VisitLogRepository visitLogRepository;

    public AlertNotificationServiceImpl(AlertNotificationRepository alertRepository,
                                        VisitLogRepository visitLogRepository) {
        this.alertRepository = alertRepository;
        this.visitLogRepository = visitLogRepository;
    }

    @Override
    public AlertNotification sendAlert(Long visitLogId) {
        Assert.notNull(visitLogId, "visitLogId must not be null");

        VisitLog visitLog = visitLogRepository.findById(visitLogId)
                .orElseThrow(() -> new IllegalArgumentException("VisitLog not found"));

        Optional<AlertNotification> existingAlert = alertRepository.findByVisitLogId(visitLogId);
        if (existingAlert.isPresent()) {
            throw new IllegalArgumentException("Alert already sent for this VisitLog");
        }

        AlertNotification alert = new AlertNotification();
        alert.setVisitLog(visitLog);
        alert.setAlertMessage("Alert for VisitLog " + visitLogId);
        alert.setSentTo(visitLog.getHost().getEmail());
        alert.setSentAt(LocalDateTime.now());

        AlertNotification saved = alertRepository.save(alert);

        // Optionally, mark in visitLog that alert was sent
        visitLog.setAlertSent(true);
        visitLogRepository.save(visitLog);

        return saved;
    }

    @Override
    public AlertNotification getAlert(Long id) {
        return alertRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Alert not found"));
    }

    @Override
    public List<AlertNotification> getAllAlerts() {
        return alertRepository.findAll();
    }
}
