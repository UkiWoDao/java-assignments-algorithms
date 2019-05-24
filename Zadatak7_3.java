package javapractice;

public class Zadatak7_3 {

	public static void main(String[] args) {
		// TODO Ispisati neparne prirodne brojeve od 1 do 17

		int i = 1;
		while(i <= 17) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}	
	}
}
