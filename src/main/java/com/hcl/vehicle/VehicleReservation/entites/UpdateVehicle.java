package com.hcl.vehicle.VehicleReservation.entites;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UpdateVehicle {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @Column(name = "vehicle_no")
    private String vehicleNo;
    
   
    @Column(name = "vehicle_type")
    private String vehicleType;
    
    
    private String branch;
    
    
    @Column(name = "insurance_type")
    private String insuranceType;
    
    
    private double price;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getVehicleNo() {
		return vehicleNo;
	}


	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getInsuranceType() {
		return insuranceType;
	}


	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "UpdateVehicle [id=" + id + ", vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + ", branch="
				+ branch + ", insuranceType=" + insuranceType + ", price=" + price + "]";
	}
    

}
