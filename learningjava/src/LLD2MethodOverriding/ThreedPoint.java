package LLD2MethodOverriding;

public class ThreedPoint extends Point {  //cannot extend in main class

	//public static void main(String args[])
	//{
	
		private int z;
		
		@Override
		public void display() {
			System.out.println("[<<"+x+">>,<<"+y+">>,<<"+z+">>]");
			
		}
		ThreedPoint(Point p, int z){
			//this.x=p.x;  //if you want to use this.x then you need to create default object point
			//this.y=p.y;
			super(p.x,p.y);
			this.z=z;
		}

	//}

}
