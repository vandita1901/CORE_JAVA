package day3;
import java.util.Scanner;
//WAP to accept marks of 5 subject print sum and avg
//Based on avg display grades
/*
* avg between 100 to 90 -> A Grade
* avg between 89 to 70-> B Grade
* avg between 69 to 50-> C Grade
* avg between 49 to 35-> D Grade
* avg below 35-> Fail
* */
public class If4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m1, m2, m3, m4, m5, sum, average;
		System.out.println("Enter the Marks of 5 Subject :");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		
		sum = m1 + m2 + m3 + m4 + m5;
		average = sum / 5;
		System.out.println("The Total of Marks of all Subjects is "+sum);
		System.out.println("The average of Marks of all Sujects is "+average);
		if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35) {
			
		if (average>=90) {
			System.out.println("The student has secured Grade A and he is Passed ✅");
		}
		else if(average>=70) {
			System.out.println("The student has secured Grade B and he is Passed ✅");
		}
		else if(average>=50) {
			System.out.println("The student has secured Grade C and he is Passed ✅");
		}
		else {
			System.out.println("The student has secured Grade D");
		}
		}
		else {
			System.out.println("The Student is fail ❌");
		}
	}

}





/*
 * 1. WAP to check whether the number contains 3 digit or not
 * Number can be positive or negative
 * 
 * 2. WAP to check last digit of number is divisible by 3 or not
 * Ex: n = 189, last_digit = 9 -> number: 189, lastdigit: 9 is divisible by 3
 * 
 * 
 * 3. WAP to check whether the character is a number or upper case
 * or lower case or special character
 * 
 * 4. WAP to display msg based on criteria
 * a. if number is divisible by 5 -> BUZZ
 * b. if number is divisible by 3 -> FIZZ
 * c. if number is divisible by 3 and 5 both -> FIZZBUZZ
 * d. if number is not divisible by 3 and 5 both -> number
 * 
 * 
 * */