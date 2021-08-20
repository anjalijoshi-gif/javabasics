package array;

public class StaticAndNonStatic {

	// global vars:the scope of global vars will be available across al the function with some conditions
	String name = "Tom"; 
	static int age = 25; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to call static method and vars
		sum();
		// calling by classname:
		StaticAndNonStatic.sum();
		
		System.out.println(StaticAndNonStatic.age);
		System.out.println(age);
		display();
		
		//how to call non static methods
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
	} 
		public void sendMail() { //non static method
			System.out.println();
		}
		
		public static void sum() { //static method
			System.out.println("Sum Method");
		}
		
		static void display() {
			System.out.println("1ssssssssssssssssssssssssss1");
		}
	
	

}
