package uros;

import java.util.Scanner;

public class Zadatak205242019 {

	public static void main(String[] args) {
		// TODO Napisati metodu koja prima broj N i K i vraca vrednost n! * k! Gde je '!' oznaka za faktorijel a * oznaka za mnozenje
		Scanner sc = new Scanner(System.in);
		
		// declare and prompt for input
		System.out.println("Unesi N");
		int N = sc.nextInt();
		System.out.println("Unesi K");
		int K = sc.nextInt();
		
		long rez = fak(N, K);
		System.out.println(rez);
	}
	
	static long fak(int N, int K) {
		long fakN = 1, fakK = 1;
		
		// calculate factorial for N
		while(N > 0) {
			fakN *= N;
			N--;
		}	
		
		// calculate factorial for K
		while(K > 0) {
			fakK *= K;
			K--;
		}	
		return fakN * fakK;
	}
	
	
}
