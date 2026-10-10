package parkinglot.model;

import parkinglot.model.enumtypes.ParkingSpotStatus;
import parkinglot.model.enumtypes.VehicleTypeEnum;

public class ParkingSpot {
	private long id;
	private int spotNumber;
	private VehicleTypeEnum vehicleTypeEnum;
	private ParkingSpotStatus parkingSpotStatus;
	private Vehicle vehicle;
	private ParkingFloor parkingFloor;
	
	public ParkingSpot(long id, int spotNumber, VehicleTypeEnum vehicleTypeEnum, 
			Vehicle vehicle, ParkingFloor parkingFloor) {
		super();
		this.id = id;
		this.spotNumber = spotNumber;
		this.vehicleTypeEnum = vehicleTypeEnum;
		this.parkingSpotStatus = parkingSpotStatus.Avaiable;
		this.vehicle = vehicle;
		this.parkingFloor = parkingFloor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}
	public VehicleTypeEnum getVehicleTypeEnum() {
		return vehicleTypeEnum;
	}
	public void setVehicleTypeEnum(VehicleTypeEnum vehicleTypeEnum) {
		this.vehicleTypeEnum = vehicleTypeEnum;
	}
	public ParkingSpotStatus getParkingSpotStatus() {
		return parkingSpotStatus;
	}
	public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
		this.parkingSpotStatus = parkingSpotStatus;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public ParkingFloor getParkingFloor() {
		return parkingFloor;
	}
	public void setParkingFloor(ParkingFloor parkingFloor) {
		this.parkingFloor = parkingFloor;
	}
	
	

}
