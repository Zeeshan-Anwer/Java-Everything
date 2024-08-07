package pack.java.lange;

class Student{
	String name;
	int rollno;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public  String toString() {
		//return name+"...."+rollno;
		return"This is student with the name :"+name+"and roll no:"+rollno;
	}
}

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Durga",101);
		Student s2=new Student("Ravi",102 );
		Student s3=new Student("Durga",101);
		Student s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
	
	} 

}
