package com.example.demo.model;
public class Appointment{
    @Id
    private Long id;
    private String visitor;
    private String host;
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
    public String setVisitor(){
        this.visitor=visitor;
    }
    public String getHost(){
        return host;
    }
    public String setHost(){
        this.host=host;
    }
    public String getAppointmentDate(){
        return appointmentDate;
    }
    public String setAppointmentDate(){
        this.appointmentDate=appointmentDate;
    }
    public String getPurpose(){
        return purpose;
    }
    public String setPurpose(){
        this.purpose=purpose;
    }
    public String getStatus(){
        return status;
    }
    public String setStatus(){
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