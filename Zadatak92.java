package javapractice;

public class Zadatak92 {

	public static void main(String[] args) {
		// TODO Napisati program da ispisuje u prvo redu crtice umjesto imena i na kraju ispisuju ime a zatim u svakom narednom po jedno ime vise

		int i = 1;
		String ime = "IME ";
		while(i <= 3) {
			int j = 1;
			while(j <= 3 - i) {
				System.out.print("--- ");
				j++;
			}
			int k = 1;
			while(k <= i) {
				System.out.print(ime);
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
