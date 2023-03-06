package com.hcl.vehicle.VehicleReservation.services;

import java.util.List;

import com.hcl.vehicle.VehicleReservation.entites.UpdateVehicle;

public interface UpdateVehicleReservationService {
	public List<UpdateVehicle> getAllVehicles();
    public UpdateVehicle getVehicleById(Long id);
    public void addVehicle(UpdateVehicle vehicle);
    public void updateVehicleDetails(Long id, UpdateVehicle updatedVehicle);
    public void deleteVehicle(Long id);
	
}
