package day5;
import java.util.Scanner;
public class Perfect_no_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1,sum =0, num;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		while(i<num) {
			if(num % i ==0) {
				sum = sum + i; 
			}
			i++;
		}
		if(num==sum) {
			System.out.println(num+" is a perfect Number");
		}
		else {
			System.out.println(num+" is not a perfect Number as the sum is "+sum);
		}
	}

}
