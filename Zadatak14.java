package javapractice;
import java.util.Scanner;
import java.lang.Math;
public class Zadatak14 {

	public static void main(String[] args) {
		// TODO Ispis kvadratnog korijena prirodnih brojeva do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		double a = 0;
		while(i <= n) {
			a = Math.sqrt(i);
			System.out.println(a);
			i++;
		}
	}

}
