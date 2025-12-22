package com.example.demo.service;
import jakarta.persistence.Service;
import com.example.demo.model.AlertNotification;
public interface AlertNotificationService{
    AlertNotification sendAlert(Long visitLogId);
    AlertNotification getAlert(Long id);
    List<AlertNotification> getAllAlert();
}