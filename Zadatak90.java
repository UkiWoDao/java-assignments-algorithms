package javapractice;

public class Zadatak90 {

	public static void main(String[] args) {
		// TODO Napisati program da ispisuje 3 puta u 3 reda IME sa razmakom
		
		int i = 1;
		String ime = "IME ";
		
		while (i <= 3) {
			int j = 1;
			while(j <= 3) {
				System.out.print(ime);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
