package javapractice;

import java.util.Scanner;

public class Zadatak71 {

	public static void main(String[] args) {
		// TODO Naci sumu brojeva u intervalu od a do b djeljivih sa 5 i koliko ih ima
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi a");
		int a = sc.nextInt();
		System.out.println("Unesi b");
		int b = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		while(a <= b) {
			if(a % 5 == 0) {
				sum += a;
				count += 1;
			}
			a++;
		}
		System.out.println("Suma je " + sum + ", a kolicina brojeva deljivih sa 5 u tom intervalu je " + count);
	}

}
