package parkinglot.model;

import java.util.Date;

public class Ticket {
	private long id;
	private String ticketNumber;
	private Date entryTime;
	private Vehicle vehicle;
	private ParkingSpot parkingSpot;
	private Gate entryGate;
	private Operator operator;
	
	public Ticket(long id, String ticketNumber, Vehicle vehicle, ParkingSpot parkingSpot,
			Gate entryGate, Operator operator) {
		super();
		this.id = id;
		this.ticketNumber = ticketNumber;
		this.entryTime = new Date();
		this.vehicle = vehicle;
		this.parkingSpot = parkingSpot;
		this.entryGate = entryGate;
		this.operator = operator;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}
//	public ParkingSpot getParkingSpot() {
//		return parkingSpot;
//	}
//	public void setParkingSpot(ParkingSpot parkingSpot) {
//		this.parkingSpot = parkingSpot;
//	}
//	public Gate getEntryGate() {
//		return entryGate;
//	}
//	public void setEntryGate(Gate entryGate) {
//		this.entryGate = entryGate;
//	}
//	public Operator getOperator() {
//		return operator;
//	}
//	public void setOperator(Operator operator) {
//		this.operator = operator;
//	}

}
