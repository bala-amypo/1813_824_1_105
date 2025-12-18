package com.example.demo.model;
@Entity
public class AlertNotification{
    @Id
    private Long id;
    private String visitLog;
    private String sentTo;
    private String alertMessage;
    private LocalDateTime sentAt;


}