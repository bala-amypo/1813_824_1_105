package com.example.demo.service.impl;

import com.example.demo.model.AlertNotification;
import com.example.demo.model.VisitLog;
import com.example.demo.repository.AlertNotificationRepository;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.AlertNotificationService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class AlertNotificationServiceImpl implements AlertNotificationService {

    public AlertNotificationRepository alertRepository;
    public VisitLogRepository visitLogRepository;

    public AlertNotification sendAlert(Long visitLogId) {
        VisitLog vl = visitLogRepository.findById(visitLogId)
                .orElseThrow(() -> new RuntimeException("VisitLog not found"));

        Optional<AlertNotification> existing = alertRepository.findByVisitLogId(visitLogId);
        if (existing.isPresent()) {
            throw new IllegalArgumentException("Alert already sent");
        }

        AlertNotification a = new AlertNotification();
        a.setVisitLog(vl);
        if (vl.getHost() != null)
            a.setSentTo(vl.getHost().getEmail());
        a.setAlertMessage("Visitor checked in");
        a.setSentAt(LocalDateTime.now());
        vl.setAlertSent(true);

        alertRepository.save(a);
        visitLogRepository.save(vl);

        return a;
    }

    public AlertNotification getAlert(Long id) {
        return alertRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alert not found"));
    }

    public List<AlertNotification> getAllAlerts() {
        return alertRepository.findAll();
    }
}
