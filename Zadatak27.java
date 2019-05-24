package javapractice;
import java.util.Scanner;

public class Zadatak27 {

	public static void main(String[] args) {
		// TODO  	Izracunati i ispisati sumu kvadrata prvih n prirodnih brojeva
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi k");
		int k = sc.nextInt(), zbir = 0; 
		
		System.out.println("Unesi n");
		int n = sc.nextInt();
		
		while(k <= n) {
			zbir += k * k;
			k++;
		}
		System.out.println(zbir);
	}

}
