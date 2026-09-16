package designpatterns.prototypeandregistry.invoiceGeneration;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

	private HashMap<InvoiceTypes,Invoice> hashmap;
	
	
	
	public InvoicePrototypeRegistryImpl() {
		hashmap = new HashMap<InvoiceTypes, Invoice>();
	}

	@Override
	public Invoice retrieve(InvoiceTypes type) {
		// TODO Auto-generated method stub
		return hashmap.get(type);
	}

	@Override
	public Invoice cloneObject(InvoiceTypes type) {
		// TODO Auto-generated method stub
		System.out.println(hashmap.containsKey(type));
	if(hashmap.containsKey(type)) {
		
		return hashmap.get(type).clone();
	}
	return null;
	}

	@Override
	public void add(InvoiceTypes type, Invoice invoice) {
		// TODO Auto-generated method stub
		hashmap.put(type, invoice);
	}

}
