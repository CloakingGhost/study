package p260programing.num1;

public class ColoredCircle extends Circle{
	 String color;
	
	ColoredCircle(int radius, String color){
		super(radius);
		this.color = color;
	}
	
	void show() {
		System.out.printf("반지름이 %d인 %s원이다",radius,color);
	}
}
