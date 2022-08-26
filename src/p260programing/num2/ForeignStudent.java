package p260programing.num2;

public class ForeignStudent extends Student {

	String country;

	ForeignStudent(String name, int age, int stdtId, String country) {
		super(name, age, stdtId);
		this.country = country;
	}

	public String toString() {
		return "Person [name=" + getName() + ", age=" + getAge() + "stdtId=" + getStdtId() + "country=" + country + "]";
	}
}
