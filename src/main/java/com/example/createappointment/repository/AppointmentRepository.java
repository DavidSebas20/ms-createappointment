package com.example.createappointment.repository;


import com.example.createappointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Ejemplo: buscar citas por paciente o doctor
}
