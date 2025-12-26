package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Appointment;
import java.util.List;
public interface Appointmentrepository extends JpaRepository<Appointment,Long>{

    List<Appointment> findByHost(String host);

    List<Appointment> findByVisitor(String visitor);
}

