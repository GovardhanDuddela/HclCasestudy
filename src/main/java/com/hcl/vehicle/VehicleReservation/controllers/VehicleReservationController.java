package com.hcl.vehicle.VehicleReservation.controllers;
import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.vehicle.VehicleReservation.entites.VehicleReservation;
import com.hcl.vehicle.VehicleReservation.repository.VechileRepository;

@RestController
@RequestMapping("/api/reservations")
public class VehicleReservationController {
    
    @Autowired
    private VechileRepository vehicleReservationRepository;
    
    @PostMapping
    public VehicleReservation createReservation(@RequestBody VehicleReservation reservation) {
        return vehicleReservationRepository.save(reservation);
    }
    
    @GetMapping("/{id}")
    public VehicleReservation getReservationById(@PathVariable Long id) {
        try {
			return vehicleReservationRepository.findById(id).orElseThrow(() -> new AttributeNotFoundException("Reservation not found"));
		} catch (AttributeNotFoundException e) {
			e.printStackTrace();
		}
		return null;
    }
    
    @PutMapping("/{id}")
    public VehicleReservation updateReservation(@PathVariable Long id, @RequestBody VehicleReservation reservation) throws AttributeNotFoundException {
        VehicleReservation existingReservation = vehicleReservationRepository.findById(id).orElseThrow(() -> new AttributeNotFoundException("Reservation not found"));
        existingReservation.setFirst_name(reservation.getFirst_name());
        existingReservation.setLast_name(reservation.getFirst_name());
        existingReservation.setAge(reservation.getAge());
        existingReservation.setLocation(reservation.getLocation());
        return vehicleReservationRepository.save(existingReservation);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable Long id) {
        VehicleReservation existingReservation = null;
		try {
			existingReservation = vehicleReservationRepository.findById(id).orElseThrow(() -> new AttributeNotFoundException("Reservation not found"));
		} catch (AttributeNotFoundException e) {
			e.printStackTrace();
		}
        vehicleReservationRepository.delete(existingReservation);
        return ResponseEntity.ok().build();
    }
}
