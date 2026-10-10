package parkinglot.model;

import java.util.Date;

import parkinglot.model.enumtypes.PaymentStatus;
import parkinglot.model.enumtypes.PaymentTypeEnum;

public class Payment {
	private long id;
	private double amount;
	private PaymentTypeEnum paymentTypeEnum;
	private PaymentStatus paymentStatus;
	private String referenceNum;
	private Date time;
	
	public Payment(long id, double amount, PaymentTypeEnum paymentTypeEnum, String referenceNum) {
		super();
		this.id = id;
		this.amount = amount;
		this.paymentTypeEnum = paymentTypeEnum;
		this.paymentStatus = PaymentStatus.PENDING;
		this.referenceNum = referenceNum;
		this.time = new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public PaymentTypeEnum getPaymentTypeEnum() {
		return paymentTypeEnum;
	}
	public void setPaymentModeEnum(PaymentTypeEnum paymentTypeEnum) {
		this.paymentTypeEnum = paymentTypeEnum;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getReferenceNum() {
		return referenceNum;
	}
	public void setReferenceNum(String referenceNum) {
		this.referenceNum = referenceNum;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}


}
