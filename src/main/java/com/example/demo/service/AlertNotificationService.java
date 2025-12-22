package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.model.AlertNotification;
public interface AlertNotificationService{
    AlertNotification sendAlert(Long visitLogId);
    AlertNotification getAlert(Long id);
    List<AlertNotification> getAllAlert();
}