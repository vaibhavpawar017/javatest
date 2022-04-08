package methods;

public class example4 {

	public static void main(String[] args) {
	System.out.println("Regular Non Static Method");
	example4 e4=new example4();

			e4.test3();

	}
	
public void test3() {
	System.out.println("This is Regular Non Static Method");
	System.out.println("Non Static Method Call From Different Class");
}


}
