package javapractice;
import java.lang.Math;
public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Ispis kvadratnog korena prirodnih brojeva do 10
		
		int i = 1;
		double a = 1;
		
		while(i <= 10) {
			a = Math.sqrt(i);
			System.out.println("Kvadratni koren od prirodnog broja " + i + " je " + a);
			i++;
		}
		
	}

}
