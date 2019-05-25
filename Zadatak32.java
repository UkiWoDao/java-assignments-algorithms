package javapractice;

import java.util.Scanner;

public class Zadatak32 {

	public static void main(String[] args) {
		// TODO Suma parnih prirodnih brojeva od 1 do n
		Scanner sc = new Scanner(System.in);
		int zbir = 0, i = 1, n = sc.nextInt(); 
		
		while(i <= n) {
			if(i % 2 == 0) {
				zbir += i;
			}
			i++;
		}
		System.out.println(zbir);
	}

}
