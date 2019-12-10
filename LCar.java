import java.util.Scanner;
import java.util.LinkedList;
public class LCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("How many favorite cars do your have?");
		myFavCars();

	}
	
	public static void myFavCars() {
		LinkedList<String>f1 = new LinkedList<String>();
		Scanner keyboard = new Scanner(System.in);
		int how = keyboard.nextInt();
		System.out.println("Enter your favorite cars.");
		for(int i = 0; i <= how; i++) {
			String x = keyboard.nextLine();
			f1.add(x);
			
		}
		System.out.println("All cars have been added\n");
		
		for(int i = 0; i <= how; i++) {
			System.out.println(f1.get(i));
		}
	}

}
