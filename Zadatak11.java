package javapractice;
import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		// TODO Napisati program za ispis reciprocnih vrijednosti prvih n prirodnih brojeva
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		double i = 1.00; 
		int n = sc.nextInt();
		
		while(i <= n) {
			double a = 1/i;
			System.out.println(a);
			i++;
		}
	}

}
