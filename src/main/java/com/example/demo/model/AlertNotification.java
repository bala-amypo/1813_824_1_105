package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class AlertNotification {

    @Id
    private Long id;

    private String alertMessage = "Visitor arrived";
    private String sentTo;
    private LocalDateTime sentAt;

    private Long visitLogId;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAlertMessage() { return alertMessage; }
    public void setAlertMessage(String alertMessage) { this.alertMessage = alertMessage; }

    public String getSentTo() { return sentTo; }
    public void setSentTo(String sentTo) { this.sentTo = sentTo; }

    public LocalDateTime getSentAt() { return sentAt; }
    public void setSentAt(LocalDateTime sentAt) { this.sentAt = sentAt; }

    public Long getVisitLogId() { return visitLogId; }
    public void setVisitLogId(Long visitLogId) { this.visitLogId = visitLogId; }
}
