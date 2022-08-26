package p254challenge;

public class BestGirl extends GoodGirl {
	
	BestGirl(){
		
	}
	BestGirl(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void show() {
		System.out.println(name+"I'm a best Girl");
	}
}
