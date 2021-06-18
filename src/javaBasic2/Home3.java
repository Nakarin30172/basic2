package javaBasic2;

public class Home3 {

public static void main(String[] args) {
	draw9(4);	
	draw10(4);
	draw11(3);	
	draw12(4);
	draw13(4);
	draw14(3);
	draw15(3);
	draw16(3);

}


public static int draw9(int  n ) {
	
	   for(int i = 0; i<n; i++) {
		   int j  =i *2;
		 System.out.println(j);
	   } 
	   return n; 
	   }

public static int draw10(int  n ) {
		   for(int i = 0; i<n; i++) {
			   int j  =(i+1) *2;
			 System.out.println(j);
		   } 
		   return n;
		  }      

public static int draw11(int  n ) {
	        for (int i = 1; i <= n ; i++) { 
	            for (int j = 1; j <= n ; j++) {
	                System.out.print("\t" + (i * j));
	            }
	            System.out.println();
	        }
	        return n;
	        }
public static int draw12(int  n ) {
    for (int i = 1; i <= n ; i++) { 
    	for (int k = 2; k <= i ; k++) {
            System.out.print("*");
    	}
        for (int j = i; j == i ; j++) {
            System.out.print("_");         
    	}
        for (int l = n; l > i ; l--) {
            System.out.print("*");
    	}
        System.out.println();
    }
    return n;
    }
public static int draw13(int  n ) {
	for (int i = 1; i <= n ; i++) { 
		for (int l = n; l > i ; l--) {
            System.out.print("*");
    	}
        for (int j = i; j == i ; j++) {
            System.out.print("_");         
    	}
        for (int k = 2; k <= i ; k++) {
            System.out.print("*");
    	}
        System.out.println();
    }
    return n;
    }
public static int draw14(int  n ) {
    for (int i = 0; i <= n-1 ; i++) { 
        for (int j = 1; j <= i+1 ; j++) {
            System.out.print("*");
        }
        for (int k = 1; k <= n-1-i ; k++) {
            System.out.print("_");
        }
        System.out.println();
    }
    return n;
    }
public static int draw15(int  n ) {
	int o =n-1;
    for (int i = 0; i <= o ; i++) { 
        for (int j = 1; j <= o-i ; j++) {
            System.out.print("*");
        }
        for (int k = 1; k <= i+1 ; k++) {
            System.out.print("_");
        }
        System.out.println();
    }
    return n;
    }

public static int draw16(int  n ){

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(i);
      for (int k = 1;( k <= n-i ); k++) {
          System.out.print("_");
      }
      System.out.println();
    }

    for (int i = n; i >= 0; i--) {
      for (int j = 1; j <= i; j++)
        System.out.print(i);

      for (int l = 1; (l <= n-i)  ; l++) {
          System.out.print("_");
      
      }
  
      System.out.println();
    }
    
    return n;
    }

}