package designpatterns.prototypeandregistry.invoiceGeneration;



public interface InvoicePrototypeRegistry {

	public void add(InvoiceTypes type,Invoice invoice);
	public Invoice retrieve(InvoiceTypes type);
	public Invoice  cloneObject(InvoiceTypes type);

}
