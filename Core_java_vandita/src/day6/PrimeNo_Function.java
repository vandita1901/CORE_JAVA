package day6;
import java.util.Scanner;
public class PrimeNo_Function {
	
	public static boolean isPrime(int number) {
		if(number <=1) {
			return false;	
		}
		for(int i =2;i<=number-1;i++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is Prime or Not: ");
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println("Number "+n+ " is a Prime Number");
		}
		else {
			System.out.println("Number "+n+" is not a Prime Number");
		}
	}
}
