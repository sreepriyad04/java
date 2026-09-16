package designpatterns.prototypeandregistry.invoiceGeneration;

public class Client {
	public static void main(String[] args) {
		
		InvoicePrototypeRegistryImpl registry = new InvoicePrototypeRegistryImpl();
		TemplateConfig.fillRegistry(registry);
		
		Invoice in1=registry.retrieve(InvoiceTypes.STANDARD).clone();
		System.out.println(in1.getCustomerName());
	}

}
