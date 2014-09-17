package software;

public class ProgramCounter {
	private int i;
	
	public ProgramCounter() {
		i = 0;
	}
	
	public void increase() {
		i++;
	}
	
	public void jump(int i) {
		this.i = i;
	}
	
	public int getPC() {
		return i;
	}
}
