class Practical12
{
	String name;
	int enrollment;
	int age;
	public Practical12()
	{
		name="unknown";
		enrollment=0;
		age=0;
	}
	public Practical12(String name,int enrollment)
	{
		this.name=name;
		this.enrollment=enrollment;
		age=0;
	}
	public Practical12(String name,int enrollment,int age)
	{
		this.name=name;
		this.enrollment=enrollment;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Enrollment : "+enrollment);
		System.out.println("Age : "+age);
	}
}
class Constructor
{
	public static void main(String args[])
	{
	Practical12 p=new Practical12();
	Practical12 p1=new Practical12("viral",25);
	Practical12 p2=new Practical12("Abhi",44,18);
	System.out.println("Default constructor :");
	p.display();
	System.out.println("Parametrized constructor with 2 parameter");
	p1.display();
	System.out.println("Parametrized constructor with 3 Parameter");
	p2.display();
	}
}
