package StudentClass;

class Student{
	
	int age;
	public String name;
	
	void display()
	{
		System.out.println("My name is "+name+".I am "+age+" years old");
	}
	void Hello(String name) {
		String namemtd =name;
		System.out.println(""+name+" says hello to "+namemtd);
		//System.out.println(name+"says hello");
	}
	
}

