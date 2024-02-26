import java.util.*;
class Rectangle	
{
	Rectangle( float height,float width)
	{
		System.out.println("The Height is "+height);
		System.out.println("The Width is "+width);
		System.out.println("The Area is "+(height*width)); 
	}
}
class Practical7
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Height:");
		float h=sc.nextFloat();
		System.out.println("Enter Width:");
		float w=sc.nextFloat();
		Rectangle R1 =new Rectangle(h,w);
	}
}