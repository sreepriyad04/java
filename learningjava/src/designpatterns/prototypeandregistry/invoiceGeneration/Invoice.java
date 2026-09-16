package designpatterns.prototypeandregistry.invoiceGeneration;

public class Invoice implements ObjectClonable{
	
	private String invoiceId;
	private String customerName;
	private Double amount;
	private String dueDate;
	private InvoiceTypes invoiceType;
	@Override
	public Invoice clone() {
		return this;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public InvoiceTypes getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(InvoiceTypes type) {
		this.invoiceType = type;
	}
	

}
