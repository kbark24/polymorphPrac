
public class ClTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What clothes do you have?\n");
		
		CStack cs = new CStack();
		
		cs.push("shirt", "black", false);
		cs.push("pants", "red", false);
		cs.push("shorts", "white", true);
		
		cs.showMe();

	}

}
