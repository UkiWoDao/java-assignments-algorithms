package javapractice;

public class Zadatak16_02 {

	public static void main(String[] args) {
		// TODO ispisati neparne prirodne brojeve od 1 do 5

		int i = 1;
		while(i <= 5) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
