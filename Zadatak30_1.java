package javapractice;

public class Zadatak30_1 {

	public static void main(String[] args) {
		// TODO Suma neparnih prirodnih brojeva od 1 do 5
		int zbir = 0, i = 1; 
		
		while(i <= 5) {
			if(i % 2 != 0) {
				zbir += i;
			}
			i++;
		}
		System.out.println(zbir);
	}

}
