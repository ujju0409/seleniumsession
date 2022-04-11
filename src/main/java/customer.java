
public class customer {

	public void test() {
		System.out.println("test");
		int a=20;
		System.out.println(a+"test methods ");
		
	}
	
	
	public int  getMarks() {
		int b =20;
		int c= 30;
		int d= 40;
		int total =b+c+d;
		System.out.println(b+c+d);
		return total;
	
	}
	
	public static void main(String[] args) {
		
		
		customer obj = new customer();
		 int e=obj.getMarks();
		 System.out.println(e);
		 
		

		
		
		
		
		
		
		
		
	}

}
