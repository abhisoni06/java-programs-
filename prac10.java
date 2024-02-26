class Practical0
{
	final int val=10;
	final void finalmethod()
	{
		System.out.println("This is final method");
		System.out.println("Name is Fichadiya Abhi");
	}
}
class Final
{
	public static void main(String args[])
	{
		Practical0 f=new Practical0();
		System.out.println("Final value is "+f.val);
		f.finalmethod();
	}
}