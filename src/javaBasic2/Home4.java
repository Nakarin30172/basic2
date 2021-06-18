package javaBasic2;
import java.util.Scanner;
public class Home4 {
	   public static void main(String[] args) {
		      Scanner n = new Scanner(System.in);

		      System.out.print("");
		      int num = n.nextInt();

		      for (int i = 1; i <= 12; i++) {
		         System.out.println(i + " * " + num + " = " + (i * num));
		      }
		   }
}
