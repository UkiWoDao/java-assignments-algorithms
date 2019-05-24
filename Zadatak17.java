package javapractice;

import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {
		// TODO Ispis parnih i neparnih prirodnih brojeva od 1 do n (test parnosti i neparnosti)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		
		while(i <= n) {
			if(i % 2 != 0) {
				System.out.println(i + " je paran broj.");
			} else {
				System.out.println(i + " je neparan broj.");
			}
			i++;
		}
	}

}
