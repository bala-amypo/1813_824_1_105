package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.AlertNotification;

public interface AlertNotificationRepository {
    AlertNotification save(AlertNotification a);
    Optional<AlertNotification> findById(Long id);
    Optional<AlertNotification> findByVisitLogId(Long visitLogId);
    List<AlertNotification> findAll();
}
