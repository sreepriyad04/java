package PersonClassDeepCpoy;

public class MainClass {

	public static void main(String args[]) {
		PersonClass p1 =  new PersonClass(10, "Kim");
		
		//PersonClass p =  new PersonClass();
		//p.name="p.Name";
		
		System.out.println(p1.printMessage());
	//	System.out.println(p.toString());
		
		//for deep copy create a new object and assign all the old oject values to new one 
		
		PersonClass p2 = new PersonClass(0, null);
		p2.age=p1.age;
		p2.name=p1.name;
		System.out.println(p2.printMessage());
	}
}
