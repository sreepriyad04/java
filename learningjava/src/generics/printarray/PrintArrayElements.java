package generics.printarray;

public class PrintArrayElements<T> {
	
	public static <T> void printArray(T[] array) {
		for(T r: array) {
			System.out.print(r+" ");
			
		}
		
	}
}
