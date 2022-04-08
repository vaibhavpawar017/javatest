package methods;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("=====================================================");
		System.out.println("Static Regular Method");
		Example3 e3=new Example3();
		e3.test1();
		e3.test2();
		System.out.println("=====================================================");
example4 e4=new example4();//Non Static Method Call From Differnt Class
e4.test3();

		
	}
public void test1()
{
	System.out.println("Non Static Regular Method");
	
}
public void test2()
{
	System.out.println("Non Static Regular Method Call From Same Class");
}

}
