package p260programing.num3;

public class PointExample {
	
	public static void main(String[] args) {
		Point[] point = {new Point(2,3),new MovablePoint(3,4,5,6)};
		for(Point p : point) {
			System.out.println( p.toString())
			;
		}

	}

}
