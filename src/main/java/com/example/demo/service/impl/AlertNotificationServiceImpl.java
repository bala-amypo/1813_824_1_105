package com.example.demo.service.impl;

import com.example.demo.model.AlertNotification;
import com.example.demo.model.VisitLog;
import com.example.demo.repository.AlertNotificationRepository;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.AlertNotificationService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private AlertNotificationRepository alertRepository;
    private VisitLogRepository visitLogRepository;

    @Override
    public AlertNotification sendAlert(Long visitLogId) {
        VisitLog vl = visitLogRepository.findById(visitLogId).orElseThrow();
        Optional<AlertNotification> existing = alertRepository.findByVisitLogId(visitLogId);
        if(existing.isPresent()) throw new IllegalArgumentException("Alert already sent");

        AlertNotification a = new AlertNotification();
        a.setVisitLogId(visitLogId);
        a.setSentTo(vl.getHost().getEmail());
        a.setSentAt(LocalDateTime.now());
        vl.setAlertSent(true);
        visitLogRepository.save(vl);
        return alertRepository.save(a);
    }

    @Override
    public AlertNotification getAlert(Long id) {
        return alertRepository.findById(id).orElseThrow();
    }

    @Override
    public List<AlertNotification> getAllAlerts() {
        return alertRepository.findAll();
    }
}
