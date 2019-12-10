
public class NBA {
	
	
	String name;
	int draftpick;
	String pos;
	NBA next;
	
	public NBA (int draftpick, String name, String pos) {
		this.draftpick = draftpick;
		this.name = name;
		this.pos = pos;
	}
	
	public void displayResults() {
		System.out.println(name + " was drafted " + draftpick + " and plays " + pos);
	}
	@Override
	public String toString() {
		return name;
	}

}
