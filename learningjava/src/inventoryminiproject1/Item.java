package inventoryminiproject1;

import java.util.Objects;

public class Item implements Comparable<Item>{

	String id;
	String name;
	double price;
	int quantity;
	public Item(String id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		if(this.price==o.price)
			return 0;
			else if(this.price>o.price)
				return 1;
		return -1;
	}
	
	@Override
	public int hashCode(){
		return Objects.hashCode(id);
		
	}
	@Override
	public String toString() {
		return name;
		
	}
	
	
	public boolean equals(Object o) {
		 if(this == o) return true;
//       if(o == null || getClass() != o.getClass()) return false;
//       Item item = (Item) o;
       if(!(o instanceof Item item) ) return false;
       return Objects.equals(id, item.id);
		
	}

}
