package com.example.demo.model;
@Entity

public class Host{
    @Id
    private Long id;
    private String hostName;
    private String fullname;
    private String email;
    private String department;
    private String phone;
    private String createdAt;

    public String Id(){
        return id;
    }
    public void setId(String Id){
        this.id=id;
    }
    public String HostName(){
        return hostName;
    }
    public void setHostName(String HostName){
        this.hostName=hostName;
    }
    public String FullName(){
        return fullname;
    }
    public void setFullName(String FullName){
        this.fullname=fullname;
    }
    public String Email(){
        return email;
    }
    public void setEmail(String Email){
        this.email=email;
    }
    public String Department(){
        return Department;
    }
    public void setDepartment(String Department){
        this.department=department;
    }
    public String Phone(){
        return Phone;
    }
    public void setPhone(String Phone){
        this.phone=phone;
    }
    public String CreatedAt(){
        return CreatedAt;
    }
    public void setCreateAt(String C){
        this.phone=phone;
    }





    


}