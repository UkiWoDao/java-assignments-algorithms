package javapractice;

import java.util.Scanner;

public class Zadatak16_06 {

	public static void main(String[] args) {
		// TODO Ispisati prirodne brojeve od 1 do 5 koji nisu djeljivi sa a
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi a");
		int i = 1, a = sc.nextInt();
		
		while(i <= 5) {
			if(i % a != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
