package parkinglot.model;

import java.util.ArrayList;
import java.util.List;

import parkinglot.model.enumtypes.ParkingFloorStatus;

public class ParkingFloor {
	private long id;
	private int floorNum;
	private List<ParkingSpot>parkingSpots;
	private ParkingFloorStatus parkingFloorStatus;
	public ParkingFloor(long id, int floorNum, List<ParkingSpot> parkingSpots, ParkingFloorStatus parkingFloorSpot) {
		super();
		this.id = id;
		this.floorNum = floorNum;
		this.parkingSpots = new ArrayList<>();
		this.parkingFloorStatus = parkingFloorSpot;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}
	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	public ParkingFloorStatus getParkingFloorStatus() {
		return parkingFloorStatus;
	}
	public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
		this.parkingFloorStatus = parkingFloorStatus;
	}
	
	
	
	

}
