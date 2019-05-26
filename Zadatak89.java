package javapractice;

import java.util.Scanner;

public class Zadatak89 {

	public static void main(String[] args) {
		// TODO Napisati program za ispis dana u sedmici
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koji dan po redu?");
		int n = sc.nextInt();
		
		switch (n) {
		case 0:
			System.out.println(n + ": ponedeljak");
			break;
		case 1:
			System.out.println(n + ": utorak");
			break;
		case 2:
			System.out.println(n + ": sreda");
			break;
		case 3:
			System.out.println(n + ": cetvrtak");
			break;
		default:
			System.out.println(n + ": petak");
			break;
		}
	}

}
