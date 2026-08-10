package streams;

import java.util.List;
import java.util.stream.Stream;

class DistinctNumbers {
	 
	 public static void getDistinctNumbers(List<Integer> list) {
		 
		Stream<Integer> stream=list.stream();
		stream
		     .distinct()
		     .forEach(n->System.out.println(n));
		 
	 }

}
 
 public class DistinctNumbersClient{
	 public static void main(String[] args) {
		 
		 List<Integer> list = List.of(2,4,6,2,8,9,6,4);
		 DistinctNumbers.getDistinctNumbers(list);
		
	}
 }
