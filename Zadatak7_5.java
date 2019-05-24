package javapractice;

public class Zadatak7_5 {

	public static void main(String[] args) {
		// TODO Ispisati prirodne brojeve od 1 do 17 koji nisu deljivi sa 3
		
		int i = 1;
		while(i <= 17) {
			if(i % 3 != 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
