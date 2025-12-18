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
    public voic setVisitLog(String visitLog){
        this.visitLog=visitLog;
    }
    public String getSentTo(){
        return sentTo;
    }
    public voic setSentTo(String visitLog){
        this.visitLog=visitLog;
    }
    
    




}