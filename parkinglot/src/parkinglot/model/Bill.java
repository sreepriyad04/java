package parkinglot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import parkinglot.model.enumtypes.BillStatus;

public class Bill {
	private long id;
	private Ticket ticket;
	private Date extitTime;
	private Gate exitGate;
	private Operator operator;
	private double amount;
	private BillStatus billStatus;
	private List<Payment> payments;
	
	public Bill(long id, Ticket ticket, Gate exitGate, Operator operator, double amount,
			BillStatus billStatus, List<Payment> payments) {
		super();
		this.id = id;
		this.ticket = ticket;
		this.extitTime = new Date();
		this.exitGate = exitGate;
		this.operator = operator;
		this.amount = amount;
		this.billStatus = billStatus;
		this.payments = new ArrayList<>();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Date getExtitTime() {
		return extitTime;
	}
	public void setExtiTime(Date extitTime) {
		this.extitTime = extitTime;
	}
	public Gate getExitGate() {
		return exitGate;
	}
	public void setExitGate(Gate exitGate) {
		this.exitGate = exitGate;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BillStatus getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(BillStatus billStatus) {
		this.billStatus = billStatus;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
