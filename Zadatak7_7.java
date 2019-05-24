package javapractice;

import java.util.Scanner;

public class Zadatak7_7 {

	public static void main(String[] args) {
		// TODO Ispisati prirodne brojeve od 1 do 17 koji nisu djeljivi sa a
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi a");
		int a = sc.nextInt(), i = 1;
		
		while(i <= 17) {
			if(i % a != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
