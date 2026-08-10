package streams;

import java.util.List;
import java.util.stream.Stream;

class EvenChecker{
	
	public static boolean areAllEven(List<Integer> list) {
		
		boolean stream=list.stream()
		                .allMatch(n->n%2==0);
		return stream;
		
	//	return list.stream().allMatch(n->n%2==0);  
	}

}

public class EvenCheckerClient {

	public static void main(String[] args) {
		List<Integer> list=List.of(2,4,6,9);
		System.out.print(EvenChecker.areAllEven(list));
		
		
	}
}
