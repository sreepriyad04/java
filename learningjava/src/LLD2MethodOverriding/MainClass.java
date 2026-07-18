package LLD2MethodOverriding;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p= new Point(10,20);
		
		ThreedPoint tp = new ThreedPoint(p,30);
		
		//tp.x=1;
		//tp.y=2;
		tp.display();
		
	}

}
