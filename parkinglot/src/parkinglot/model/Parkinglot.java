package parkinglot.model;

import java.util.ArrayList;
import java.util.List;

import parkinglot.exceptions.InvalidParkingLotException;
import parkinglot.model.enumtypes.GateTypeEnum;
import parkinglot.model.enumtypes.ParkingFloorStatus;
import parkinglot.model.enumtypes.ParkinglotStatus;
import parkinglot.model.enumtypes.VehicleTypeEnum;

public class Parkinglot {
	private long id;
	private String name;
	private String address;
	private List<Gate> gates;
	private List<ParkingFloor> parkingFloors;
	private ParkinglotStatus parkinglotStatus;
	private List<VehicleTypeEnum> allowedVehicleTypes;

	//	private  Parkinglot(long id, String name, String address, List<ParkingFloor> parkingFloors,
	//			 List<VehicleTypeEnum> allowedVehicleTypes) {
	//		super();
	//		this.id = id;
	//		this.name = name;
	//		this.address = address;
	//		this.parkingFloors = new ArrayList<>();
	//		this.parkinglotStatus = parkinglotStatus.OPERATIONAL;
	//		this.allowedVehicleTypes = new ArrayList<>();
	//	}
	//	
	private  Parkinglot(Builder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
		this.gates=builder.gates;
		this.parkingFloors = builder.parkingFloorsList;
		this.parkinglotStatus = builder.parkinglotStatus.OPERATIONAL;
		this.allowedVehicleTypes = builder.allowedVehicleTypes;
	}


	//	
	//	public long getId() {
	//		return id;
	//	}
	//	public void setId(long id) {
	//		this.id = id;
	//	}
	//	public String getName() {
	//		return name;
	//	}
	//	public void setName(String name) {
	//		this.name = name;
	//	}
	//	public String getAddress() {
	//		return address;
	//	}
	//	public void setAddress(String address) {
	//		this.address = address;
	//	}
	//	public List<ParkingFloor> getParkingFloors() {
	//		return parkingFloors;
	//	}
	//	public void setParkingFloors(List<ParkingFloor> parkingFloors) {
	//		this.parkingFloors = parkingFloors;
	//	}
	//	public ParkinglotStatus getParkinglotStatus() {
	//		return parkinglotStatus;
	//	}
	//	public void setParkinglotStatus(ParkinglotStatus parkinglotStatus) {
	//		this.parkinglotStatus = parkinglotStatus;
	//	}
	//	public List<VehicleTypeEnum> getAllowedVehicleTypes() {
	//		return allowedVehicleTypes;
	//	}
	//	public void setAllowedVehicleTypes(List<VehicleTypeEnum> allowedVehicleTypes) {
	//		this.allowedVehicleTypes = allowedVehicleTypes;
	//	}

	public Builder getBuilder(){
		return new Builder();
	}


	public static class Builder{
		private long id;
		private String name;
		private String address;
		private List<Gate> gates;
		private List<ParkingFloor> parkingFloorsList;
		private ParkinglotStatus parkinglotStatus;
		private List<VehicleTypeEnum> allowedVehicleTypes;

		public Builder() {

			this.gates=gates;
			this.parkingFloorsList = new ArrayList();
			this.parkinglotStatus = parkinglotStatus.OPERATIONAL;
			this.allowedVehicleTypes = new ArrayList();
		}
		public long getId() {
			return id;
		}
		public Builder setId(long id) {
			this.id = id;
			return this;
		}
		public String getName() {
			return name;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public String getAddress() {
			return address;
		}
		public Builder setGates(List<Gate> gates) {
			this.gates = gates;
			return this;
		}

		public List<Gate> getGates() {
			return gates;
		}
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		public List<ParkingFloor> getParkingFloors() {
			return parkingFloorsList;
		}
		public Builder setParkingFloors(List<ParkingFloor> parkingFloorsList) {
			this.parkingFloorsList = parkingFloorsList;
			return this;
		}
		public ParkinglotStatus getParkinglotStatus() {
			return parkinglotStatus;
		}
		public Builder setParkinglotStatus(ParkinglotStatus parkinglotStatus) {
			this.parkinglotStatus = parkinglotStatus;
			return this;
		}
		public List<VehicleTypeEnum> getAllowedVehicleTypes() {
			return allowedVehicleTypes;
		}
		public Builder setAllowedVehicleTypes(List<VehicleTypeEnum> allowedVehicleTypes) {
			this.allowedVehicleTypes = allowedVehicleTypes;
			return this;
		}

		public void validate() throws InvalidParkingLotException {
			if(parkingFloorsList.isEmpty()) {
				throw new InvalidParkingLotException("Parking lot must have alease one floor");
			}
			if(allowedVehicleTypes.isEmpty()) {
				throw new InvalidParkingLotException("Atleast one vehicle Type allowed");
			}
			boolean hasEntryGate = gates.stream().anyMatch(g->g.getGateTypeEnum()== GateTypeEnum.ENTRY);
			if(!hasEntryGate) {
				throw new InvalidParkingLotException("Parking lot must have atlease one entry gate");
			}
			boolean hasExitGate=gates.stream().anyMatch(g->g.getGateTypeEnum()==GateTypeEnum.EXIT);
			if(!hasExitGate) {
				throw new InvalidParkingLotException("Parking lot must have atlease one exit gate");
			}
			//TODO: check if at least there is one spot added in each floor

			//for(int i=0;i<parkingFloorsList.size();i++) {
			//if(parkingFloorsList.get(i).getParkingFloorStatus()==ParkingFloorStatus.FULL_CAPACITY) {
//			throw new InvalidParkingLotException("atlease one parking spot should be avaiable");
//		}
//	}
			for(ParkingFloor floors: parkingFloorsList) {

				if(floors.getParkingFloorStatus()==ParkingFloorStatus.FULL_CAPACITY) {
				
					throw new InvalidParkingLotException("atlease one parking spot should be avaiable");
				}
			}
			
		}

		public Parkinglot build() throws InvalidParkingLotException {
			validate();
			return new Parkinglot(this);
		}

	}



}
