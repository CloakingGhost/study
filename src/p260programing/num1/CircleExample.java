package p260programing.num1;

public class CircleExample {

	public static void main(String[] args) {
		Circle[] circle = {new Circle(5),new ColoredCircle(10,"red")};
		
		for(Circle c : circle) {
			c.show();
		}
	}

}
