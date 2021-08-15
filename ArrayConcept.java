package array;
public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int i[] = new int[4];
	  i[0] = 10;
	  i[1] = 20;
	  i[2] = 30;
	  i[3]= 4;
	  
	  System.out.println(i[2]);
	  System.out.println(i.length);
	  
	  for(int j=0;j< i.length;j++) {
	  
		  System.out.println(i[j]);

	}
	  Object c1[] = new Object[10];
	  c1[0]= 's';
	  c1[1]= "Anjali";
	  c1[2] = 10.00;
	  
	  System.out.println(c1[1]);
	  System.out.println(c1.length);

}
}	
