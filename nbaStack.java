
public class nbaStack {

	NBA top;
	
	nbaStack(){
		top = null;
	}
	
	public boolean isEmpty() {
		return(top==null);
	}
	
	public void peek() {
		if(isEmpty() == true) {
			System.out.println("The is nothing to peek b/c is empty.");
		}
		else {
			System.out.println("The last player picked during this portion of the draft " + top.name);
		}
	}
	
	public void push(int draftpick, String name, String pos) {
		NBA n = new NBA(draftpick, name, pos);
		
		if(isEmpty() == true) {
			top = n;
		}
		else {
			n.next = top;
			top = n;
		}
		
	}
	
	public void pop() {
		
		if(isEmpty() == true) {
			System.out.println("There is nothing to delete.");
		}
		else {
			String name = top.name;
			System.out.println(name + "has been removed from the draft.");
			top = top.next;
		}
		
	}
	
	
	
	
	
	public void playerDrafted() {
		NBA draft = top;
		
		while(draft != null) {
			draft.displayResults();
			System.out.println("The player drtafted before is " + draft.next);
			draft = draft.next;
			System.out.println();
		}
	}
	
}
