package javapractice;
import java.util.Scanner;

public class Zadatak28 {

	public static void main(String[] args) {
		/* TODO Napisati program za ispis sume reciprocnih 
		 * vrijednosti prvih n prirodnih brojeva 
		 * (harmonijski niz: 1 + 1/2 + 1/3 + ... + 1/n) */
		Scanner sc = new Scanner(System.in);
		int n;
		double i = 1;
		System.out.println("Unesi n");
		n = sc.nextInt();
		double zbir = 0;
		
		while(i <= n) {
			zbir += 1/i;
			i++;
		}
		System.out.println(zbir);
	}

}
