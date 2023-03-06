package com.hcl.vehicle.VehicleReservation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.vehicle.VehicleReservation.entites.UpdateVehicle;
import com.hcl.vehicle.VehicleReservation.repository.UpdateVehicleRepository;
import com.hcl.vehicle.VehicleReservation.services.UpdateVehicleReservationService;
import com.hcl.vehicle.VehicleReservation.services.VehicleReservaionImplentataion;

import jakarta.persistence.EntityNotFoundException;
@RestController
@RequestMapping("/api/updatevehicle")
public class UpdateVehicleController {
	 @Autowired
	    private UpdateVehicleRepository vehicleService;
	    private UpdateVehicleReservationService reservation;

	    @GetMapping
	    public List<UpdateVehicle> getAllVehicles() {
	        return  vehicleService.findAll();
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Optional<UpdateVehicle>> getVehicleById(@PathVariable Long id) {
	        try {
	            Optional<UpdateVehicle> vehicle = vehicleService.findById(id);
	            return ResponseEntity.ok(vehicle);
	        } catch (EntityNotFoundException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping
	    public ResponseEntity<UpdateVehicle> addVehicle(@RequestBody UpdateVehicle vehicle) {
	        reservation.addVehicle(vehicle);
	        return ResponseEntity.status(HttpStatus.CREATED).body(vehicle);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<UpdateVehicle> updateVehicleDetails(@PathVariable Long id, @RequestBody UpdateVehicle updatedVehicle) {
	        try {
	            reservation.updateVehicleDetails(id, updatedVehicle);
	            return ResponseEntity.ok(updatedVehicle);
	        } catch (EntityNotFoundException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
	        try {
	            reservation.deleteVehicle(id);
	            return ResponseEntity.noContent().build();
	        } catch (EntityNotFoundException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }
}
