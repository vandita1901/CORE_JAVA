package day5;
import java.util.Scanner;
public class While1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, reverse =0;
		System.out.println("Enter a Number: ");
		i = sc.nextInt();
		int original = i;
		while(i != 0) {
			int lastdigit = i % 10;
			reverse = reverse * 10 + lastdigit;
			i = i / 10;
		}
		System.out.println("The reverse of a number "+original+" is "+reverse);
		
	}
}
