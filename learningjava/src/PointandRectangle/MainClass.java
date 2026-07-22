package PointandRectangle;

public class MainClass {

	public static void main(String args[]) {
		Point p = new Point(2,6);
		Rectangle r1= new Rectangle(3,5,p);
		//r1.height=3;  // cannot use because variable is defined as public 
		//r1.width=5;
		System.out.println("Area is  "+r1.getArea());
		System.out.println("Perimeter of Rectangle is "+r1.getPerimeter());

		System.out.println(args.length);

		r1.getBottomRight();
		r1.getTopRight();


	}


}
