package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@Entity
public class VisitLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String visitor;
    private String host;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private String purpose;
    private Boolean accessGranted;
    private Boolean alertSent;
    @PrePersist
    public void prepersist(){
        if(checkInTime==null){
            checkInTime=LocalDateTime.now();
        }
        if(alertSent==null){
            alertSent=false;
        }
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getVisitor(){
        return visitor;
    }
    public void setVisitor(String visitor){
        this.visitor=visitor;
    }
    public String getHost(){
        return host;
    }
    public void setHost(String host){
        this.host=host;
    }
    public LocalDateTime getCheckInTime(){
        return checkInTime;
    }
    public void setCheckInTime(LocalDateTime checkInTime){
        this.checkInTime=checkInTime;
    }
    public LocalDateTime getCheckOutTime(){
        return checkOutTime;
    }
    public void setCheckOutTime(LocalDateTime checkOutTime){
        this.checkOutTime=checkOutTime;
    }
    public String getPurpose(){
        return purpose;
    }
    public void setPurpose(String purpose){
        this.purpose=purpose;
    }
    public Boolean getAccessGranted(){
        return accessGranted;
    }
    public void setAccessGranted(Boolean accessGranted){
        this.accessGranted=accessGranted;
    }
    public Boolean getAlertSent(){
        return alertSent;
    }
    public void setAlertSent(Boolean alertSent){
        this.alertSent=alertSent;
    }
    public VisitLog(Long id,String visitor,String host,LocalDateTime checkInTime,LocalDateTime checkOutTime,String purpose,Boolean accessGranted,Boolean alertSent){
        this.id=id;
        this.visitor=visitor;
        this.host=host;
        this.checkInTime=checkInTime;
        this.checkOutTime=checkOutTime;
        this.accessGranted=accessGranted;
        this.alertSent=alertSent;
    }
    public VisitLog(){

    }

}