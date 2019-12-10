
public class CStack {
	
	CNode top;
	
	CStack(){		
		top = null;		
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void peek() {
		if(isEmpty() == true) {
			System.out.println("There is nothing to peek");
		}
		else {
			System.out.println("The top piece of clothing is " + top.name);
			System.out.println("The top's color is " + top.color);
		}
	}
	
	public void push(String name, String color, boolean hiTemp) {		
		CNode n = new CNode(name, color, hiTemp);
		
		if(isEmpty() == true) {
			top = n;
		}else {
			n.next = top;
			top = n;
		}
		
	}
	
	public void pop() {
		if (top == null) {
			System.out.println("The stack is empty there is nothing to delete.");
		}
		else {
			String name = top.name;
			String color = top.color;
			System.out.println("Popped " + name + "with " + color);
			top = top.next;
		}
	}
	
	public void showMe() {
		CNode last = top;
		
		while(last != null) {
			last.displayNode();
			System.out.println("The next item is " + last.next);
			last = last.next;
			System.out.println();
		}
	}

}
