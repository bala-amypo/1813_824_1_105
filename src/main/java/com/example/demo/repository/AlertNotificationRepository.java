package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.AlertNotification;
import java.util.Optional;
import java.util.List;

public interface AlertNotificationRepository {
    AlertNotification save(AlertNotification a);
    Optional<AlertNotification> findById(Long id);
    Optional<AlertNotification> findByVisitLogId(Long visitLogId);
    List<AlertNotification> findAll();
}
