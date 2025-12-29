package com.example.demo.service;

import com.example.demo.model.AlertNotification;
import java.util.List;

public interface AlertNotificationService {

    AlertNotification createAlert(AlertNotification alert);

    List<AlertNotification> getAllAlerts();

    AlertNotification getAlertById(Long id);

    void deleteAlert(Long id);
}
