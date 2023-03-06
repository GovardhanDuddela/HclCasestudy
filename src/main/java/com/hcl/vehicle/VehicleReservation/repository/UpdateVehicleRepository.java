package com.hcl.vehicle.VehicleReservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.vehicle.VehicleReservation.entites.UpdateVehicle;
@Repository
public interface UpdateVehicleRepository extends JpaRepository<UpdateVehicle, Long> {

}
