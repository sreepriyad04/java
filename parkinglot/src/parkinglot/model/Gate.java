package parkinglot.model;

import parkinglot.model.enumtypes.GateStatus;
import parkinglot.model.enumtypes.GateTypeEnum;

public class Gate {
	private long id;
	private int gateNum;
	private GateTypeEnum gateTypeEnum;
	private Operator operator;
	private GateStatus gateStatus;
	public Gate(long id, int gateNum, GateTypeEnum gateTypeEnum, Operator operator) {
		super();
		this.id = id;
		this.gateNum = gateNum;
		this.gateTypeEnum = gateTypeEnum;
		this.operator = operator;
		this.gateStatus = gateStatus.OPERATIONAL;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getGateNum() {
		return gateNum;
	}
	public void setGateNum(int gateNum) {
		this.gateNum = gateNum;
	}
	public GateTypeEnum getGateTypeEnum() {
		return gateTypeEnum;
	}
	public void setGateTypeEnum(GateTypeEnum gateTypeEnum) {
		this.gateTypeEnum = gateTypeEnum;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public GateStatus getGateStatus() {
		return gateStatus;
	}
	public void setGateStatus(GateStatus gateStatus) {
		this.gateStatus = gateStatus;
	}

	
}
