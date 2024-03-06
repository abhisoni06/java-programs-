import java.util.Scanner;
class single{
	int a,b;
	void getdata(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	}
	void putdata(){
		System.out.println("addition = "+(a + b));
	}
}
class demo extends single{
	public static void main(String args[]){
		demo aa = new demo();
		aa.getdata();
		aa.putdata();
	}
}