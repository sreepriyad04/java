package passbyvaluepassbyref;

public class MainClass {
	
	public static void main(String args[]) {
		PassbyValue p1 = new PassbyValue();
		p1.change(6);
		System.out.println("from outside the method "+p1.a);
		
		p1.passbyrefMtd();
		
		System.out.println("from outside the method =="+p1.passref);
	}

}
