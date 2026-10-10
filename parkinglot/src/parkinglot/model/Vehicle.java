package parkinglot.model;

import parkinglot.model.enumtypes.VehicleTypeEnum;

public class Vehicle {
	private long id;
	private String licensePlate;
	private VehicleTypeEnum vehicleType;
	private String ownerName;
	
	public Vehicle(long id, String licensePlate, VehicleTypeEnum vehicleType, String ownerName) {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
		this.vehicleType = vehicleType;
		this.ownerName = ownerName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public VehicleTypeEnum getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleTypeEnum vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	

}
