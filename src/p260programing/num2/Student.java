package p260programing.num2;

public class Student extends Person {
	int stdtId;

	Student(String name, int age,int stdtId) {
		super(name, age);
		this.stdtId = stdtId;
	}
	
	
	public int getStdtId() {
		return stdtId;
	}


	public void setStdtId(int stdtId) {
		this.stdtId = stdtId;
	}


	public String toString() {
		return "Person [name=" + getName() + ", age=" + getAge() + "stdtId=" + stdtId + "]";
	}

}
