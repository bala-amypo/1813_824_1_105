package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class AlertNotification{
    @Id
    private Long id;
    private String visitLog;
    private String sentTo;
    private String alertMessage;
    private LocalDateTime sentAt;




}