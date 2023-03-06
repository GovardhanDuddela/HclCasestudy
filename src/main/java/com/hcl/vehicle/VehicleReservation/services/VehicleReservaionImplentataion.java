package com.hcl.vehicle.VehicleReservation.services;

import java.util.List;

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

@RestController
@RequestMapping("/api/reservations")
public class VehicleReservaionImplentataion {
	 @Autowired
	    private VehicleReservationService vehicleReservationService;
	    
	    @GetMapping
	    public List<VehicleReservation> getAllReservations() {
	        return vehicleReservationService.getAllReservations();
	    }
	    
	    @GetMapping("/{id}")
	    public VehicleReservation getReservationById(@PathVariable Long id) {
	        return vehicleReservationService.getReservationById(id);
	    }
	    
	    @PostMapping
	    public VehicleReservation createReservation(@RequestBody VehicleReservation reservation) {
	        return vehicleReservationService.createReservation(reservation);
	    }
	    
	    @PutMapping("/{id}")
	    public VehicleReservation updateReservation(@PathVariable Long id, @RequestBody VehicleReservation reservation) {
	        return vehicleReservationService.updateReservation(id, reservation);
	    }
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteReservation(@PathVariable Long id) {
	        return vehicleReservationService.deleteReservation(id);
	    }
	}
	





