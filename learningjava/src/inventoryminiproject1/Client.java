package inventoryminiproject1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) throws Exception {


		List<Item> items= new ArrayList<>();

		items.add(new Book("Id1", "Java", 123.02,5,"auth1"));
		items.add(new Clothing("Id2", "shoe", 3200.23, 3, "M"));
		items.add(new Electronics("Id3", "Phone", 500.02, 3, 12));
		items.add(new Clothing("Id2", "shoe", 3200.23, 3, "M"));

		

//
//		Collections.sort(items);
//
//		for(Item item:items) {
//			System.out.println(item.price);
//		}
//
//		System.out.println("size of an inventory is ="+inventory.size());

		// this adds item to list existing class, if you want to add items thru inventory class, create inventory object and then add
		items.add(new Book("Id2", "Java",123.0,3,"Auth2"));
		
		for(Item item:items) {
			System.out.println("Id is =" +item.getId()+"  " +item.getName());

		}

		Map<String, Item> inventory = new HashMap<>();
		for(Item item: items){
			inventory.put(item.getId(), item);
		}
		for(Item item:inventory.values()) {
			System.out.println("map Id is =" +item.getId()+"  " +item.getName());

		}
		System.out.println("size of inventory "+inventory.size());
		Inventory<Book> bookInvent = new Inventory<>();
	//	bookInvent.add(new Book("Id2", "Java1",123.0,3,"Auth2")); // throws duplicate exception
		bookInvent.add(new Book("Id5", "Java1",123.0,3,"Auth2"));
	//	bookInvent.add(new Book("Id3", "Java1",123.0,-3,"Auth2")); // throws invalid quantity exception
		bookInvent.add(new Book("Id6", "Java2",123.0,3,"Auth2"));

		
		Inventory<Item> inventoryObj= new Inventory<>();
		inventoryObj.add(new Book("Id2", "Book1",123.0,8,"Auth2"));
		inventoryObj.add(new Book("Id5", "Java1",126.0,3,"Auth2"));
		
		inventoryObj.add(new Clothing("Id3", "shoe", 3200.23, 6, "M"));
		inventoryObj.add(new Electronics("Id6", "Phone",129.0,1,2));
		
		for(Item item:inventoryObj.getAll()) {
			System.out.println(item.getId());

		}
		

	Stream<Item> stream=inventoryObj.getAll().stream();  // i cannot create stream on custom class objects it only allows methods defined inside the class, sinceGetAll return collection we can convert it to Stream()
		stream 
			.sorted((a,b)->a.toString().compareTo(b.toString()))
			//.sorted()  // this sorts by price because in iteam class we have overridden compareTo method for price
			.sorted((a,b)->Integer.compare(a.getQuantity(), b.getQuantity()))
			.filter(a ->a.getPrice()>=0)
			.filter(n->n.getQuantity()>0)
			.forEach(item->System.out.println("sorted Name "+item.getName() +" -> "+item.getPrice() +" -> "+item.getId()+" ->"+item.getQuantity()));   //if you dont sort it will return from HashMap, A HashMap does not guarantee any order


	}

}


