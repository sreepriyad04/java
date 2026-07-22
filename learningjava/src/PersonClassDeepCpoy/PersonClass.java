package PersonClassDeepCpoy;

class PersonClass{
	int age;
	String name;
	
	
	PersonClass(PersonClass p) {
		this.age = age;
		this.name = name;
	}

	PersonClass(int a, String nam){
	//	System.out.println("name is "+name+" and age is "+age);  // it means iam directly printing constructor values
		this.age=a;
		this.name=nam;
	}
	
	String printMessage() {
		return "name is "+name+ " and age is "+age;
	}
	
}
