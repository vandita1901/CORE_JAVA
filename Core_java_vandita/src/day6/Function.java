package day6;
import  java.util.Scanner;
public class Function {
	
	public static void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = n1 + n2;
		System.out.println("Addition of "+n1+" and " +n2+" is "+ result);
	}
	public static void substraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = n1 - n2;
		System.out.println("substraction of "+n1+" and " +n2+" is "+ result);
	}
	public static void Multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = n1 * n2;
		System.out.println("Multiplication of "+n1+" and " +n2+" is "+ result);
	}
	public static void Division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		float n1 = sc.nextInt();
		float n2 = sc.nextInt();
		float result = n1 / n2;
		System.out.println("Division of "+n1+" and " +n2+" is "+ result);
	}
	public static void main(String[] args) {
		addition();
		substraction();
		Multiplication();
		Division();
		
	}
}
