class Practical9
{
	 static int  variable=10;
	static void staticmethod()
	{
		System.out.println("Static variable inside static method = "+variable);
	}
	void nonstaticmethod()
	{
		System.out.println("Static variable inside nonstatic method = "+variable);
	}
}
class Demo
{
	public static void main(String args[])
	{
	System.out.println("Calling staticmethod with class name without creating object ");
	Practical9.staticmethod();
	System.out.println("Creating object and calling non staticmethod");
	Practical9 p=new Practical9();
	p.nonstaticmethod();
	}
}