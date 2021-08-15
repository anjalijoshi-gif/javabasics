package array;

public class FunctionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionInJava q = new FunctionInJava();
	    q.test();
	    int aa = q.qa();
	    System.out.println(aa);
	    
	    q.cc();
	    String ab = q.cc();
	    System.out.println(ab);
	    
	    

	}
	
	public void test() {
		System.out.println("No output");
		
	}
	
	public int qa()  {
		int a =10;
	    int b =20;
	    int c = a+b;
	    return c;
	}
	
	public String cc() {
		String r = "selenium";
		return r;
	}
	
	
	
}
