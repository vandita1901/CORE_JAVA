package day3;
import java.util.Scanner;
public class If8 {
//	4. WAP to display msg based on criteria
//	  a. if number is divisible by 5 -> BUZZ
//	  b. if number is divisible by 3 -> FIZZ
//	  c. if number is divisible by 3 and 5 both -> FIZZBUZZ
//	  d. if number is not divisible by 3 and 5 both -> number
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number;
		System.out.println("Enter a Number: ");
		number = sc.nextInt();
		if((number%3==0)&&(number%5==0)){
			System.out.println("FIZZBUZZ");
		}
		else if(number%5==0) {
			System.out.println("BUZZ");
		}
		else if(number%3==0) {
			System.out.println("FIZZ");
		}
		else {
			System.out.println("number");
		}
	}

}
