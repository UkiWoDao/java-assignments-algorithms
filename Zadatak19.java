package javapractice;

import java.util.Scanner;

public class Zadatak19 {

	public static void main(String[] args) {
		// TODO Ispis prirodnih brojeva djeljivih sa 5 od k do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi k");
		int k = sc.nextInt(); 
		System.out.println("Unesi n");
		int n = sc.nextInt();
		
		while(k <= n) {
			if(k % 5 == 0) {
				System.out.println(k);
			}
			k++;
		}
	}

}
