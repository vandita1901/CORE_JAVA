package day6;
import  java.util.Scanner;
public class Function2 {
	
	public static void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = n1 + n2;
		System.out.println("Addition of "+n1+" and " +n2+" is "+ result);
	}
	public static void substraction(int n1, int n2) {
		int result = n1 - n2;
		System.out.println("substraction of "+n1+" and " +n2+" is "+ result);
	}
	public static boolean isAge_satisfied(int age) {
		if(age < 18) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		addition();
		substraction(3, 4);
		isAge_satisfied(56);
		
	}
}
