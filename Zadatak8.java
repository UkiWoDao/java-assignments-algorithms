package javapractice;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		// TODO Ispisati prirodne brojeve od 1 do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		while(i <= n) {
			System.out.println(i);
			i++;
		}	
	}
}
