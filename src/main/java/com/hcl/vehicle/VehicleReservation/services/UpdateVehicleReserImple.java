package com.hcl.vehicle.VehicleReservation.services;
import java.util.List;

import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.vehicle.VehicleReservation.entites.UpdateVehicle;
import com.hcl.vehicle.VehicleReservation.repository.UpdateVehicleRepository;
import com.hcl.vehicle.VehicleReservation.repository.VechileRepository;

import jakarta.persistence.EntityNotFoundException;
@RestController
@RequestMapping("/updatevehicle")
public class UpdateVehicleReserImple implements UpdateVehicleReservationService {
	 @Autowired
	   private UpdateVehicleRepository updateVehicleRepo;
    @Override
	 public List<UpdateVehicle> getAllVehicles(){
		return updateVehicleRepo.findAll();
	}
	 @Override
	 public UpdateVehicle getVehicleById(Long id) {
	        return updateVehicleRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Vehicle not found with id: " + id));
	    }
	 @Override
	    public void addVehicle(UpdateVehicle vehicle) {
	        updateVehicleRepo.save(vehicle);
	    }
	 @Override
	    public void updateVehicleDetails(Long id, UpdateVehicle updatedVehicle) {
	        UpdateVehicle vehicle = updateVehicleRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Vehicle not found with id: " + id));
	        vehicle.setVehicleNo(updatedVehicle.getVehicleNo());
	        vehicle.setVehicleType(updatedVehicle.getVehicleType());
	        vehicle.setBranch(updatedVehicle.getBranch());
	        vehicle.setInsuranceType(updatedVehicle.getInsuranceType());
	        vehicle.setPrice(updatedVehicle.getPrice());
	        updateVehicleRepo.save(vehicle);
	    }

	    @Override
	    public void deleteVehicle(Long id) {
	        updateVehicleRepo.deleteById(id);
	    }
	 
}


