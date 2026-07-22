package PersonClassDeepCpoy;

public class MainClass {

	public static void main(String args[]) {
		PersonClass p1 =  new PersonClass(10, "Kim");
		
		//for deep copy create a new object and assign all the old oject values to new one 
		
		PersonClass p2 = p1; //shallow copy
		p2.age=30;
		//p2.name=p1.name;
		System.out.println("Shallow copy ");
		System.out.println("p2=="+p2.printMessage());
		System.out.println("p1=="+p1.printMessage());
		
		// for deep copy
		
		System.out.println("Deep copy ");
		PersonClass p3= new PersonClass(40,"deepCopy");
		PersonClass p4= new PersonClass(p3);
		
		System.out.println("before assigning new values ");
		System.out.println(p3.printMessage());
		System.out.println(p4.printMessage()); // empty object
		
		
        p4.age=50;
        p4.name="after deep copy";
        System.out.println("after assigning deep copy values");
        System.out.println(p3.printMessage());// prints p3 object detalils
		System.out.println(p4.printMessage()); // prints updated p4 details
		
	}
}
