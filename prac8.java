import java.util.Scanner;
class Operations
{
    float num1;
    float num2;
    Operations(float num1,float num2) 
	{
        this.num1 = num1;
        this.num2 = num2;
    }
	void display() 
	{
        System.out.println("Addition : " +(num1+num2));
		System.out.println("Substraction : " +(num1-num2));
		System.out.println("Multiplication : " +(num1*num2));
		if(num2<=0)
			System.out.println("Divison of zero not possible");
		else
			System.out.println("Divison : " +(num1/num2));
    }
}

class Practical8 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        float n1= sc.nextFloat();
        System.out.println("Enter Number 2 : ");
        float n2= sc.nextFloat();
        Operations R1 = new Operations(n1,n2); 
	    R1.display();
	}
}