package day5;
import java.util.Scanner;
public class Pallindrome_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, reverse =0;
		System.out.println("Enter a number: ");
		i = sc.nextInt();
		int original = i;
		while(i != 0) {
			int lastdigit = i % 10;
			reverse = reverse * 10 + lastdigit;
			i = i/10;
		}
		if(reverse == original) {
			System.out.println(original+ " is a pallindrome number");
	
		}
		else {
			System.out.println(original+" is not a pallindrome number");
		}
	}
}
