package methods;

public class Mathematical_operation {
	public void Addition()
	{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("The Addition of two no. is "+sum);
	
	}		

	public static void main(String[] args) {
		System.out.println("================================================");
Mathematical_operation a=new Mathematical_operation();//calling non static method from the same class
a.Addition();
Example1.Test1();//static method calling from different class
Substraction();//calling non static method from different class
example4 e4=new example4();//non static method call from different class
e4.test3();
System.out.println("========================================================");

	}
	public static void Substraction()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("The Substraction of two no. is "+sub);
		
	}

}
