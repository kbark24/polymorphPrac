import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class ListL {

	public static void main(String[] args) {
		// Final Exam prep..... this list adds test dates to the schedule.
		
		System.out.println("Welcome to the new school year!!");
		System.out.println("Please enter you for test dates");
		displayTestDays();
		
		
		

	}
	
	
	
	public static void displayTestDays() {
		
		String t1 [] = new String [4];
		LinkedList<String>td1 = new LinkedList<String>();
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			String x = keyboard.nextLine();
			td1.add(x);
			System.out.println("Test Date Added\n");
			if(i>2) {
				System.out.println("The last test has been added\n");
			}
		}
		System.out.println("These are you test dates this year");
		for(int i = 0; i < 4; i++) {
			
			System.out.println(td1.get(i));
		}
	}
	

}
