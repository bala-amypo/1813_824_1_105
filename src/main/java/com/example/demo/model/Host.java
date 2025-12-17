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


    


}