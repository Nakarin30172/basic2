package javaBasic2;

public class Home1 {
	public static void main(String[] args) {
//		draw1(4);
		draw2(4);
		
	}
	
	public static int draw1(int  n ) {

	        for (int j = 1; j <= n ; j++) {
	            System.out.print("*");

				
	    }
	    return n;
	    }
	
	public static int draw2(int  n ) {
	    for (int i = 0; i <= n ; i++) { 
	    	int o =0;
	        for (int j = 1; j <= n ; j++) {
	        		o++;
	            System.out.print(o);
	        }
	        System.out.println();
	    }
	    return n;
	    }
}
