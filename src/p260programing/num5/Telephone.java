package p260programing.num5;

public class Telephone extends Phone{
	private String when;
	
	Telephone(String owner,String when) {
		super(owner);
		this.when = when;
	}

	
	void autoAnswering() {
		System.out.println(owner + " 부재 중 " + when + " 통화가능");
	}
}
