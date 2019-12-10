import java.util.Scanner;
public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter numbers in a String");
		
		String x = keyboard.next();
		int count = 0;
		for(int i = 0; i < x.length(); i++ ) {
			
			if(x.charAt(i)=='1') {
				count++;
			}
			
		}System.out.println(count);
		
		int[] xy = new int[4];
		xy[0] = 2;
		
		String[] gg = new String[8];
		gg[6] = "Gee Gee";
		
		
		

	}

}
