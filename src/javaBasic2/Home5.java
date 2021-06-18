package javaBasic2;

public class Home5 {
	public static void main(String[] args) {

		draw18(3);
		draw19(3);
		draw20(3);
		draw21(3);
		draw22(4);
		draw23(3);
		draw24(3);
		draw25(4);

	}
	public static int draw18(int  n ) {
		int o =n-1;
	    for (int i = 0; i <= o ; i++) { 
	        for (int j = 1; j <= o-i ; j++) {
	            System.out.print("_");
	        }
	        for (int k = 1; k <= i+1 ; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    return n;
	    }
	public static int draw19(int  n ) {
		int o =n-1;
	    for (int i = 0; i <= o ; i++) { 
	        for (int j = 1; j <= i+1 ; j++) {
	            System.out.print("_");
	        }
	        for (int k = 1; k <= o-i ; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    return n;
	    }

	public static int draw20(int  n ){
	    for (int i = n; i >= 0; i--) {
		      for (int j = 1; j <= i; j++)
		        System.out.print("_");

		      for (int l = 1; (l <= n-i)  ; l++) {
		          System.out.print("*");
		      
		      }
		  
		      System.out.println();
		    }
	    for (int i = 1; i < n; i++) {
	      for (int j = 1; j <= i; j++)
	        System.out.print("_");
	      for (int k = 1;( k <= n-i ); k++) {
	          System.out.print("*");
	      }
	      System.out.println();
	    }

	    return n;
	    }
	public static int draw21(int  n ){
  	  int u=0;
	    for (int i = n; i >= 0; i--) {
		      for (int j = 1; j <= i; j++)
		        System.out.print("_");

		      for (int l = 1; (l <= n-i)  ; l++) {  

		    	  u=u+1;
		          System.out.print(u);
		          
		      }
		  
		      System.out.println();
		    }
	    for (int i = 1; i < n; i++) {
	      for (int j = 1; j <= i; j++)
	        System.out.print("_");
	      for (int k = 1;( k <= n-i ); k++) {
	    	   u=u+1;
	          System.out.print(u);
	      }
	      System.out.println();
	    }

	    return n;
	    }
	public static int draw22(int  n ) {
		int i;
        int j;
        int k;
        int l;
        
        for(i=1; i<n; i++){
            int o=n-1;
            for(l=1; l<=o-i; l++){
                System.out.print("-");
            }
            
            for(j=2; j<=i; j++){
                System.out.print("*");
            }
            
            for(k=j-2; k>=0; k--){
                System.out.print("*");
            }
            for(l=1; l<=o-i; l++){
                System.out.print("-");
            }
            
            System.out.println("");
        }
	    return n;
	    }
	public static int draw23(int  n ) {
		int i;
        int j;
        int k;
        int l;
        
        for(i=1; i<=n; i++){
            int o=n-1;
            for(l=2; l<=i; l++){
                System.out.print("-");
            }
            
            for(j=1; j< (n-i)+1; j++){
                System.out.print("*");
            }
            
            for(k=n-i+1; k>=1; k--){
                System.out.print("*");
            }
            for(l=2; l<=i; l++){
                System.out.print("-");
            }
            
            System.out.println("");
            
        }
	    return n;
	    }
	public static int draw24(int  n ) {
			for (int i =0 ; i<2*n-1; i++) {
				for(int j =0; j<Math.abs(n-i-1);j++) 
	                System.out.print("-");
				for(int j =0; j<(2*n-1)-2*Math.abs(n-i-1);j++) 
	                System.out.print("*");
				for(int j =0; j<Math.abs(n-i-1);j++) 
	                System.out.print("-");
	        System.out.println("");		
		    }
		    return n;
		    }
	public static int draw25(int  n ) {
		int y=0;
		for (int i =0 ; i<2*n-1; i++) {
			for(int j =0; j<Math.abs(n-i-1);j++) 
                System.out.print("-");
			for(int j =0; j<(2*n-1)-2*Math.abs(n-i-1);j++) {
					y++;
                System.out.print(y);}
			for(int j =0; j<Math.abs(n-i-1);j++) 
                System.out.print("-");
        System.out.println("");		
	    }
	    return n;
	    }
}
