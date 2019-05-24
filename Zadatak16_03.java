package javapractice;

public class Zadatak16_03 {

	public static void main(String[] args) {
		// TODO Ispisati prirodne brojeve od 1 do 5 koji su djeljivi sa 3

		int i = 1;
		while(i <= 5) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
