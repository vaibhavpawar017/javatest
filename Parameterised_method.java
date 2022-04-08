package methods;

public class Parameterised_method {

	public static void main(String[] args) {
	Parameterised_method a=new Parameterised_method();
	a.Mock_group();
	a.Mock_group2("Saurabh", 1111111111l, 'B');
	a.Mock_group2("Dipali",2222222222l, 'B');
	
		
		
	}

	
	public void Mock_group() {
	String name="Vaibhav";

	long mobno=7666350774l;
	char batch= 'B';
	System.out.println("My Name Is "+name);
	System.out.println("My Mob. No. Is "+mobno);
	System.out.println("My Batch Is "+batch);
	
	}
	public void Mock_group2(String name,long mobno,char batch) {
		System.out.println("========================================");
		System.out.println("My Name Is "+name);
		System.out.println("My Mob. No. Is "+mobno);
		System.out.println("My Batch Is "+batch);
		System.out.println("========================================");
		
		
	}
	
	
	
	
}
