package day5;
//WAP to check whether the number is a Prime number or not
import java.util.Scanner;
public class Prime_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i=2;
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		boolean isPrime = (num > 1)? true:false;
		while(i <= num/2) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		if(isPrime) {
			System.out.println("Number "+num + " is a Prime Number");
		}
		else {
			System.out.println("Number "+num+ " is not a Prime Number");
		}
	}
 
}
