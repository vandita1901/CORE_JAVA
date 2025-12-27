package day6;
import java.util.Scanner;
public class PrimeSeries_function {
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
	public static void generateseries() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print series of Prime Number: ");
		int n = sc.nextInt();
		if(n<=1) {
			System.out.println("For prime Number series number should  be positive integer greater than 1");
			return;
		}
		for(int i =2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		generateseries();
	}
}
