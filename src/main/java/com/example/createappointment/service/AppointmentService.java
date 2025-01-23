package com.example.createappointment.service;

import com.example.createappointment.entity.Appointment;
import com.example.createappointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    // Crear una nueva cita
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Obtener una cita por ID
    public Optional<Appointment> getAppointment(Long id) {
        return appointmentRepository.findById(id);
    }

    // Actualizar una cita (ejemplo de lógica)
    public Appointment updateAppointment(Long id, Appointment updatedAppointment) {
        if (appointmentRepository.existsById(id)) {
            updatedAppointment.setId(id);
            return appointmentRepository.save(updatedAppointment);
        }
        return null;
    }

    // Eliminar una cita
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}
