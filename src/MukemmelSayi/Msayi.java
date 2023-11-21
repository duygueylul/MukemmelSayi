package MukemmelSayi;
import java.util.Scanner;

public class Msayi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s;
		System.out.println("Bir Sayı Giriniz: ");
		s = scan.nextInt();
		
		if(mukemmel(s)) {
			System.out.println("Sayı Mükemmeldir.");
		}
		else {
			System.out.println("Sayı Mükemmel Değildir.");
		}

	}
	
	
	
	public static boolean mukemmel(int s) {
		int bolToplam = 0;
		for(int i = 1; i < s; i++) {
			if(s % i == 0) {
				bolToplam = bolToplam + i;
			}
		}
		
		if(bolToplam == s) {
			return true;
		}
		else {
			return false;
		}
	}

}
