package p260programing.num4;

public class OvershadowTest {

	public static void main(String[] args) {
		Parent p = new Child();
		p.print(); // 자식의 메소드를 재정의 했기 때문
		System.out.println(p.name);

	}

}
