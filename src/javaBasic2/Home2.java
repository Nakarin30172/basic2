package javaBasic2;

public class Home2 {
	public static void main(String[] args) {
		String[][] table = { 
			     { "1", "2", "3" }, 
			     { "4", "5", "6" }, 
			     { "7", "8", "9" } 
			}; 
		for (String[] row : table) {
		     for (String element: row) {
		    	 int count = Integer.parseInt(element);
		       System.out.println(count*2);
		     }

	}
}
}