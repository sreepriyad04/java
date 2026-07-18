package pointandrectangleconstructors;

public class Point {
	int x;
	int y;
	
	Point(int x, int y){  //two parameter constructor
	this.y=y;
	this.x=x;
	}

	Point(Point other){  //this is copy constructor it takes an object of same class
		this.x=other.x;
		this.y=other.y;
		
	}
	
}
