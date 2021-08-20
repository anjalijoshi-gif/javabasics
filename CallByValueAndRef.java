package array;

public class CallByValueAndRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndRef obj = new CallByValueAndRef();
		
		int x = 75;
		int y = 33;
		int n = obj.testsum(x,y); //callby value or pass by value
		System.out.println(n);
		
		obj.p = 22;
		obj.q = 444;
		
		obj.ca(obj);
	}
	
	public int testsum(int a,int b) {
		a = 22;
		b = 33;
		int c = a+b;
		return c;
	}
    
	public void ca(CallByValueAndRef k) {
		int temp;
		temp = k.p;
		k.p = k.q;
		k.q = temp;
	}
}
