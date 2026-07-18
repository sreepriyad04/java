package PointandRectangle;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Rectangle {
	private int height;
	private int width;

	public int  getArea() {
		//System.out.println("area is "+height*width);
		return height*width;
	}
	public int getPerimeter() {
		return 2*(height+width);
	}	
	public static void getBottomRight(Point p, int width, int height) {
		
		int x= p.x+width;
		int y=p.y-height;
		System.out.println("x=="+x+ " and y is =="+y);
	}
	public static void getTopRight(Point p, int width, int height) {
		int x = p.x+width;
		int y=p.y;
		System.out.println(" top right is x=="+x+ " and y is =="+y);
	}
	
	public static void main(String args[]) {
		
		Rectangle r1= new Rectangle();
		r1.height=3;
		r1.width=5;
		System.out.println("Area is  "+r1.getArea());
		System.out.println("Perimeter of Rectangle is "+r1.height);
		//System.out.println(args[0]);
		System.out.println(args.length);
		
		Point p = new Point();
		p.x=2;
		p.y=6;
		getBottomRight(p,r1.width,r1.height);
		getTopRight(p,r1.width,r1.height);
		
	
	}
}
