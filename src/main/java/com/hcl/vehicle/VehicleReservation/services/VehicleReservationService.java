package com.hcl.vehicle.VehicleReservation.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hcl.vehicle.VehicleReservation.entites.VehicleReservation;

public interface VehicleReservationService {

	public List<VehicleReservation> getAllReservations();
	
	public VehicleReservation createReservation(VehicleReservation reservation);
		
	public VehicleReservation getReservationById(Long id);
		
	public VehicleReservation updateReservation(Long id, VehicleReservation reservation); 
		
	public ResponseEntity<?> deleteReservation(Long id) ;

}
