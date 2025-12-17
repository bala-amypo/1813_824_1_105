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
    public void Email(String Email){
        this.email=email;
    }
    public String d




    


}