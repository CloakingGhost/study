package p260programing.num5;

public class Phone {
	protected String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	void talk() {
		System.out.println(owner + "통화 중");
	}
}
