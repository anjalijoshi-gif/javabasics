package array;

public class LocalVsGlobal {

	String name = "Anjali";
	int age = 200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 30;
		System.out.println(i);
		
		LocalVsGlobal bb = new LocalVsGlobal();
		System.out.println(bb.age);
		
		

	}
	
	public int jj() {
	int a = 33;
	int b = 44;
	int c = a+b;
	return c;
	// System.out.println(jj); why its give error
	
	
	
	
	

}
}
	
