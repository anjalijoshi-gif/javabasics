package array;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading() ;
		obj.sum() ;
		obj.sum(1) ;

	}
	
	public void sum () 
	{
	System.out.println("void sum ");
	}
	
	public void sum (int x) 
	{
	System.out.println("system print ");
	}
	
	public void sum (int x,int y) 
	{
	System.out.println(x+y);
	}
	
	
	
}	
	


