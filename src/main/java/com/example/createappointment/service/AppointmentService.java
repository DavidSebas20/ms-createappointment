package com.example.createappointment.service;

import com.example.createappointment.entity.Appointment;
import com.example.createappointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment createAppointment(Appointment appointment) {
        // Validar que el estado sea "PENDING" o "CANCELLED"
        if (!"PENDING".equals(appointment.getStatus()) && !"CANCELLED".equals(appointment.getStatus())) {
            throw new IllegalArgumentException("Invalid status. Must be 'PENDING' or 'CANCELLED'.");
        }
        return appointmentRepository.save(appointment);
    }
}