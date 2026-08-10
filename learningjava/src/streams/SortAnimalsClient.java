package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class SortAnimals {

	public static Stream sortAnimalsByLengthDesendint(List<String> list) {
		
		Stream<String> stream=list.stream();
		return stream.sorted(Comparator.comparingInt(String::length));
		
	}
	
}
public class SortAnimalsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=List.of("Dog","Hippopotamas","Elephant","Cat");
	Stream<String>  sortedList= SortAnimals.sortAnimalsByLengthDesendint(list);
	sortedList.forEach(n->System.out.println(n));// to print stream, use forEach
	
}
}

