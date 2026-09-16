package designpatterns.prototypeandregistry.invoiceGeneration;

public class TemplateConfig {
	//public static InvoicePrototypeRegistryImpl registry;
	
	public static void fillRegistry(InvoicePrototypeRegistryImpl registry) {
		
		Invoice standardInvoice = new Invoice();
		standardInvoice.setCustomerName("customer Name 1");
		standardInvoice.setInvoiceId("Id1");
		standardInvoice.setAmount(100.01);
		standardInvoice.setDueDate("10-10-2026");
		standardInvoice.setInvoiceType(InvoiceTypes.STANDARD);
		
		registry.add(InvoiceTypes.STANDARD, standardInvoice);
		
		Invoice enterpriseInvoice = new Invoice();
		enterpriseInvoice.setAmount(101.02);
		enterpriseInvoice.setCustomerName("CustId2");
		enterpriseInvoice.setDueDate("11-10-2026");
		enterpriseInvoice.setInvoiceId("Id2");
		enterpriseInvoice.setInvoiceType(InvoiceTypes.ENTERPRISE);
		
		registry.add(InvoiceTypes.ENTERPRISE, enterpriseInvoice);
	}

}
