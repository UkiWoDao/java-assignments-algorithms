package javapractice;

import java.util.Scanner;

public class Zadatak90_05 {

	public static void main(String[] args) {
		/* TODO Napisati program za ispis trougla 
		 * kao na slici sa zeljenim brojem redova
		 http://www.znanje.org/knjige/computer/Java/ib01/082Java/082_while_jav.php */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int n = sc.nextInt(), i = 0;

		while(i < n) {
			int k = 1;
			while(k <= i) {		
				System.out.print(k);
				k++;
			}
			i++;
			System.out.println(i);
		}
	}

}
