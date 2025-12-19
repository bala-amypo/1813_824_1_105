package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Host;
public interface Hostrepository extends JpaRepository<Host,Long>{
    
}