package javapractice;

public class Zadatak92_01 {

	public static void main(String[] args) {
		/* TODO Napisati program za ispis dvocifrenih brojeva kao na slici 
		 sa dvije petlje (za svaku cifru odvojena petlja)
		 http://www.znanje.org/knjige/computer/Java/ib01/082Java/082_while_jav.php */
		
		int i = 1, count = 10;
		
		while(i < 10) {
			int j = 0;
			while(j < 10) {
				System.out.print(count);
				System.out.print(" ");
				j++;
				count++;
			}
			System.out.println();
			i++;
		}
	}

}
