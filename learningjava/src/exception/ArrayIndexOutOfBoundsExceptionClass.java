package exception;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBoundsExceptionClass {

	public static int accessArrayElements(ArrayList list,int index) {
		
		try {
			if(index >=0 && index<=list.size()) {
				return (int) list.get(index);
			}
			else throw new ArrayIndexOutOfBoundsException("Invalid Index ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		//	e.getStackTrace();
			//System.out.println(e.getMessage() +e.getStackTrace());
			System.out.println(e);
			//return -1;
		}
		return -1;			
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList();
		list.add(12);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(accessArrayElements(list,2));
		System.out.println(accessArrayElements(list,-2));

	}

}
