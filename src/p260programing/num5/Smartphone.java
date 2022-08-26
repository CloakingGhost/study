package p260programing.num5;

public class Smartphone extends Phone{
	private String game;
	
	Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
		// TODO Auto-generated constructor stub
	}

	
	void playGame() {
		System.out.println(owner + game +" 중");
	}
}
