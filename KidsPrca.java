
public class KidsPrca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		
		q.enQueue("Wilson", "jan", "male");
		q.enQueue("Grace", "may", "female");
		q.enQueue("John", "dec", "male");
		q.enQueue("Janic", "nov", "male");
		
		q.myKids();

	}

}
class KNode{
	
	String name;
	String bMonth;
	String sex;
	KNode next;
	
	public KNode(String name, String bMonth, String sex) {
		this.name = name;
		this.bMonth = bMonth;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return name;
	}
	public void disC() {
		System.out.println("name: " + name + " sex: " + sex);
	}	
}
class Queue{
	KNode top;
	KNode tail;
	
	Queue(){
		top = null;
		tail = null;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public void peek() {
		if(isEmpty()== true) {
			System.out.println("There are no kids made yet");
		}
		else {
			System.out.println("The oldest kid is " + top.name);
		}
		
	}
	public void enQueue(String name, String bMonth, String sex) {
		KNode node = new KNode(name, bMonth, sex);
		if(tail==null) {
			top = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}		
	}
	public void deQueue(String name, String bMonth, String sex) {
		KNode node = new KNode(name, bMonth, sex);
		if(top==null) {
			tail = null;
			System.out.println("There are no kids created yet");
		}
		else {
			String n = top.name;
			System.out.println(n + "has just left the house.");
			top = top.next;
		}		
	}
	public void myKids() {
		KNode kids = top;
		
		while(kids!=null) {
			kids.disC();
			System.out.println("The next kid in line will be " + kids.next);
			kids = kids.next;
			System.out.println();
		}
		
		
		
		
	}
}