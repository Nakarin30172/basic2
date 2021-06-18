package javaBasic2;

public class Home1 {
	public static void main(String[] args) {
		draw1(4);
		draw2(4);
		draw3(4);		
		draw4(4);	
		draw6(4);	
		draw7(4);
		draw8(4);
	}
	
	public static int draw1(int  n ) {

	        for (int j = 1; j <= n ; j++) {
	            System.out.print("*");

				
	    }
	    return n;
	    }
	
	public static int draw2(int  n ) {
	    for (int i = 1; i <= n ; i++) { 
	    	int o =0;
	        for (int j = 1; j <= n ; j++) {
	        		o++;
	            System.out.print(o);
	        }
	        System.out.println();
	    }
	    return n;
	    }
	
	public static int draw3(int  n ) {
	    for (int i = 1; i <= n ; i++) { 
	    	int o =n+1;
	        for (int j = 1; j <= n ; j++) {
	        		o--;
	            System.out.print(o);
	        }
	        System.out.println();
	    }
	    return n;
	    }
	
	public static int draw4(int  n ) {
	    for (int i = 1; i <= n ; i++) { 

	        for (int j = 1; j <= n ; j++) {

	            System.out.print(i);
	        }
	        System.out.println();
	    }
	    return n;
	    }
	
	public static int draw6(int  n ) {
	    for (int i = 1; i <= n ; i++) { 

	        for (int j = 1; j <= n ; j++) {

	            System.out.print(n-i+1);
	        }
	        System.out.println();
	    }
	    return n;
	    }
	public static int draw7(int  n ) {
        for (int i = 1; i <= n ; i++) { 
            for (int j = 1; j <= n ; j++) {
                System.out.print("\t" + (i * j));
            }
            System.out.println();
        }
        return n;
        }
	public static int draw8(int  n ) {
        for (int i = n; i >= 1 ; i--) { 
            for (int j = n; j >= 1 ; j--) {
                System.out.print("\t" + (i * j));
            }
            System.out.println();
        }
        return n;
        }
}
