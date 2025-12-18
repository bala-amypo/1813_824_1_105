package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class AlertNotification{
    @Id
    @GeneratedValue(strategy.GenerationType.IDENTITY)
    private Long id;
    private String visitLog;
    private String sentTo;
    private String alertMessage;
    private LocalDateTime sentAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getVisitLog(){
        return visitLog;
    }
    public void setVisitLog(String visitLog){
        this.visitLog=visitLog;
    }
    public String getSentTo(){
        return sentTo;
    }
    public void setSentTo(String sentTo){
        this.sentTo=sentTo;
    }
    public String getAlertMessage(){
        return alertMessage;
    }
    public void setAlertMessage(String alertMessage){
        this.alertMessage=alertMessage;
    }
    public LocalDateTime getSentAt(){
        return sentAt;
    }
    public void setSentAt(String sentAt){
        this.sentAt=sentAt;
    }
    public AlertNotification(Long id,String visitLog,String sentTo,String alertMessage,String)
    
    
    
    




}