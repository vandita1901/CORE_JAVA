package day4;
import java.util.Scanner;
public class While2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the number: ");
		i = sc.nextInt();
		while(i>=1) {
			System.out.print(i+" \t");
			i--;
		}
	}

}
