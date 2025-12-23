package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.AlertNotification;

public interface AlertNotificationrepository 
      extends JpaRepository<AlertNotification, Long>{
}
