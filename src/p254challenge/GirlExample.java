package p254challenge;

public class GirlExample {

	public static void main(String[] args) {
		// BestGirl ⊂ GoodGirl ⊂ Girl
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();
		
		Girl[] girls = {new Girl("갑순이"),new GoodGirl("콩쥐"),new BestGirl("황진이")};
		
		for(Girl g : girls) {
			g.show();
		}
		
	}

}
