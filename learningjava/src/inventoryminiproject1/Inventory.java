package inventoryminiproject1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import inventoryminiproject1.exceptions.DuplicateItemException;
import inventoryminiproject1.exceptions.InvalidQuantityException;

public class Inventory <T extends Item>{

	 private HashMap<String, T> item = new HashMap<>();
	 
	public void add(T item) throws InvalidQuantityException, DuplicateItemException  {
	
	if(item.getQuantity()<0)  {
		throw new DuplicateItemException("negative quantity cannot be added");
		
	}
	else if(this.item.containsKey(item.getId())) {
			throw new InvalidQuantityException("Duplicate Id found");
			
		}
		
	else {
		//System.out.println("from add method  "+item.id);
		this.item.put(item.getId(), item);
	}
	}
	public void remove(String id) {
		item.remove(id);
	}
	public String getName(String id) {
		
		return getName(id);
		
	}
	public Collection<T> getAll() {
		return  item.values();
		}

	
}
