package razniZadaci;

import java.util.Scanner;

public class ZadatakLaksi1 {

	public static void main(String[] args) {
		// TODO Izracunati hipotenuzu c trougla ako su date stranice a i b

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi stranicu a");
		int a = sc.nextInt();
		
		System.out.println("Unesi stranicu b");
		int b = sc.nextInt();
		
		double j = a * a + b * b;
		
		double c = Math.sqrt(j);
		System.out.println(c);
	}

}
