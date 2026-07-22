package PointandRectangle;

public class Rectangle {
	private int height;
	private int width;
	Point p;

	public Rectangle(int height, int width, Point p) {  //auto generated from right click-source
		super();
		this.height = height;
		this.width = width;
		this.p = p;
	}

	public int  getArea() {
		//System.out.println("area is "+height*width);
		return height*width;
	}
	public int getPerimeter() {
		return 2*(height+width);
	}	

	public  void getBottomRight() {

		int x= p.getX()+width;
		int y=p.getY()-height;
		System.out.println("x=="+x+ " and y is =="+y);
	}
	public  void getTopRight() {
		int x = p.x+width;
		int y=p.y;
		System.out.println(" top right is x=="+x+ " and y is =="+y);
	}


}
