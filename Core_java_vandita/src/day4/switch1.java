package day4;
import java.util.Scanner;
public class switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int DayNumber;
		System.out.println("Enter the day Number: ");
		DayNumber = sc.nextInt();
		switch(DayNumber){
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Please Enter the Number from 1 to 7");
		}
		
	}

}
