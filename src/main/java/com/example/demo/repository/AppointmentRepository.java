package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Appointment;
import java.util.List;
public interface AppointmentRepository {
    Appointment save(Appointment a);
    Optional<Appointment> findById(Long id);
    List<Appointment> findAll();
    List<Appointment> findByHostId(Long hostId);
    List<Appointment> findByVisitorId(Long visitorId);
}

