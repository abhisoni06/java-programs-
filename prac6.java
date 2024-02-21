class Stud
{ 
	public static void main(String args[])
	{
	Student s1=new Student();
	s1.display(44,"Abhi");
	Student s2=new Student();
	s2.display(25,"viral");
	Student s3=new Student();
	s3.display(42,"yash");
	}
}
class Student
{
	static void display(int x,String y)
	{
		System.out.println("Enrollment number = "+x);
		System.out.println("Name = "+y);
	}
}
