package javapractice;

public class Zadatak91 {

	public static void main(String[] args) {
		// TODO Napisati program da ispisuje u prvo redu jedno ime a zatim u svakom narednom po jedno ime vise

		String ime = "";
		int i = 1;
		
		while(i <= 3) {
			ime += "IME ";
			System.out.println(ime);
			i++;
		}
	}

}
