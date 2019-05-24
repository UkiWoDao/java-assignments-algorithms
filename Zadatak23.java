package javapractice;

public class Zadatak23 {

	public static void main(String[] args) {
		// TODO Saberi parne prirodne brojeve do 100
		
		int i = 1, zbir = 0;
		while(i <= 100) {
			if(i % 2 ==0) {
				zbir += i;
			}
			i++;
		}
		System.out.println(zbir);
	}

}
