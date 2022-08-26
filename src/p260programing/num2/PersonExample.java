package p260programing.num2;

public class PersonExample {

	public static void main(String[] args) {
		Person[] person = {new Person("GilDong",22),new Student("HwangJin",23,100),new ForeignStudent("Amy",30,200,"U.S.A")};
		
		for(Person p : person) {
			System.out.println(p.toString());
		}

	}

}
