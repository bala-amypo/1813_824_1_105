package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
@Entity
public class Appointment{
    @Id
    private Long id;
    private String visitor;
    private String host;
    @NotNull(message="past date can't be valid")
    private String appointmentDate;
    private String purpose;
    private String status;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getVisitor(){
        return visitor;
    }
    public void setVisitor(){
        this.visitor=visitor;
    }
    public String getHost(){
        return host;
    }
    public void setHost(){
        this.host=host;
    }
    public String getAppointmentDate(){
        return appointmentDate;
    }
    public void setAppointmentDate(){
        this.appointmentDate=appointmentDate;
    }
    public String getPurpose(){
        return purpose;
    }
    public void setPurpose(){
        this.purpose=purpose;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(){
        this.status=status;
    }
    public Appointment(Long id,String visitor,String host,String appointmentDate,String purpose,String status){
        this.id=id;
        this.visitor=visitor;
        this.host=host;
        this.appointmentDate=appointmentDate;
        this.purpose=purpose;
        this.status=status;
    }
    public Appointment(){

    }
    

}