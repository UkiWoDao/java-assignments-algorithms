package uros;
import java.util.Scanner;
public class Zadatak105212019 {

	public static void main(String[] args) {
		// class constructor
		Scanner sc = new Scanner(System.in);
		
		// prompt for num
		System.out.println("Input an integer");
		
		// declare and init variables
		int sum = 0, num = sc.nextInt();
		
		while (num != 0) {
			sum += num;
			System.out.println("Input another integer");
			num = sc.nextInt();
		}
		System.out.println("The sum up until this point is " + sum);
	}
}
