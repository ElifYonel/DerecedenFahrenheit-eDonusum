package derecedonusum;
import java.util.Scanner;
public class donusum {

	      public static void main(String[] args) {

	         double celcius,fahrenheit;
	         Scanner oku=new Scanner(System.in); 

	         System.out.print("Derece cinsinden s�cakl�k de�erini giriniz: ");
	         celcius = oku.nextInt();
	         fahrenheit = celcius * 1.8 + 32;
	         System.out.println("S�cakl�k de�eri " +fahrenheit + " fahrenheittir.");
	      }
}
