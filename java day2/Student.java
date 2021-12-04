package Com.Sonata1;

public class Student {
	int stdId;
	String stdName, stdClass;
	// default constructor
	Student(){}
	//parameterized constructor
	Student(int Id ,String Name,  String Class){
			this.stdId=Id;
			this.stdName=Name;
			this.stdClass=Class;
	}
	public void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(123,"harsha","four");
		s1.display();
		
		Student s2=new Student(456,"shalu","five");
		s2.display();

	}

}
