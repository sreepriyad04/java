package streams;

import java.util.List;
import java.util.stream.Stream;

class FilterFruits {
	
	public static void filterFruitsStartingWithA(List<String> list) {
		
		Stream<String> stream=list.stream();
		stream
			.filter(n->n.toString().startsWith("A"))
			.forEach(n->System.out.println(n));
	//	return stream;	
	}
	
}
 public class FilterFruitsClient{
	
	public static void main(String[] args) {
		
	//	FilterFruits fruits=new FilterFruits();  // can we removed
		
		List<String> list=List.of("Apple", "Banana","Avacado","Apricot");
		
	//	fruits.filterFruitsStartingWithA(list);   // since filterFruitsStartingWithA is a static methods we can access it using class name
		
		FilterFruits.filterFruitsStartingWithA(list); 
	}
	
}
