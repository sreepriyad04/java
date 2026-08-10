package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list= List.of(4,2,3,9,8,1,8);
		System.out.println(list.size());
		
		Stream<Integer> stream=list.stream();// converts list to stream 
		
		stream  
			.map(n ->n*3)
			.filter(n->n%2==0)
			.distinct()
			.dropWhile(n->n%4==0) 
			//It only removes elements from the beginning of the stream while the condition is true. As soon as it finds the first element that does not satisfy the condition, it stops dropping and keeps the rest
			.forEach(n->System.out.println("from forEach() ==" +n));
			//.collect(Collectors.toList());
			
		//stream.forEach(n->System.out.println(n));
			
				
				
				
		
	 
	}

}
