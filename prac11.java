import java.util.*;
class Demo
{
	public static void main(String ar[])
	{
		Shape S1=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius :");
		float r=sc.nextInt();
		S1.Area(r);
		System.out.println("Enter Length :");
		float l=sc.nextFloat();
		System.out.println("Enter Width :");
		float w=sc.nextFloat();
		S1.Area(l,w);
	}
}
class Shape
{
	float Area(float r)
	{
		System.out.println("Area Of Circle:"+3.14*r*r);
		return 0;
	}
	float Area(float len,float wed)
	{
		System.out.print("Area Of Rectangle:"+len*wed);
		return 0;
	}
}