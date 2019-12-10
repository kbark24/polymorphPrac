
public class CNode {
	
	int id;
	String name;
	String color;
	boolean hiTemp;
	CNode next;
	
	public CNode (String name, String color, boolean hiTemp) {
		this.name = name;
		this.color = color;
		this.hiTemp = hiTemp;
	}
	
	public void displayNode() {
		System.out.println("Name: " + name + " Color: " + color + " Temp: " + hiTemp);
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	

}
