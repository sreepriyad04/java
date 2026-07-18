package LLD2MethodOverriding;

public class Point {

	protected int x;
	protected int y;
	
	 Point(int i, int j) {
		// TODO Auto-generated constructor stub
		this.x=i;
		this.y=j;
	}

	public void display() {
		System.out.println("[<<"+x+">>,<<"+y+">>]");
	}
	
	Point(){
		
	}
}	

