package p260programing.num5;

public class PhoneExample {

	public static void main(String[] args) {
		Phone[] phone = {new Phone("황진이"),new Telephone("길동이","내일"),new Smartphone("민국이","갤러그")};

		for(Phone p : phone) {
			if (p instanceof Smartphone) {
				((Smartphone)p).playGame();
			}else if(p instanceof Telephone) {
				((Telephone)p).autoAnswering();
			}else if(p instanceof Phone) {
				p.talk();
			}
		}
	}

}
