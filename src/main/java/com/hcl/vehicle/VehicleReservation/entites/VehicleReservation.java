package com.hcl.vehicle.VehicleReservation.entites;

import java.time.LocalDate;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


    @Entity
	@Table(name = "vehicle_reservation")
	public class VehicleReservation {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name = "firstname")
	    private String first_name;
	    
	    @Column(name = "lastname")
	    private String last_name;
	    
	    @Column(name="age")
	    private int age;
	      
	    @Column(name = "location")
	    private String location;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public String toString() {
			return "VehicleReservation [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", age="
					+ age + ", location=" + location + "]";
		}
      
		
	}



