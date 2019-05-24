package javapractice;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Ispisati prirodne brojeve od k do n
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Unesi k");
		int k = sc.nextInt();
		System.out.println("Unesi n");
		int n = sc.nextInt();
		
		while(k <= n) {
			System.out.println(k);
			k++;
		}
	}

}
