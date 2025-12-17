package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
@Entity
public class Visitor{
    @Id
    private Long id;
    @NotNull(message="This field is required")
    private String fullName;
    private String email;
    private String phone;
    @NotNull(message="This field is required")
    private String idProofNumber;
    private String createdAt;
    
    public Long  getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getIdProofNumber(){
        return idProofNumber;
    }
    public void setIdProofNumber(String idProofNumber){
        this.idProofNumber=idProofNumber;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt=createdAt;
    }
    public Visitor(Long id,String fullname,String email,String phone,String idProofNumber,String LocalDateTime){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.phone=phone;
        this.idProofNumber=idProofNumber;
        this.createdAt=createdAt;
    }
    public Visitor(){

    }
    
    

}