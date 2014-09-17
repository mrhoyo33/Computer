package hardware;

public class Address implements Operand {
	int index;
	
	public Address(int arg) {
		index = arg;
	}

	public Word getWord(Memory m) {
		return m.getWord(index);
	}
	
	public void add(Operand o1, Operand o2, Memory m) {
		m.getWord(index).add(o1.getWord(m),o2.getWord(m));
	}
	
	public void mul(Operand o1, Operand o2, Memory m) {
		m.getWord(index).mul(o1.getWord(m),o2.getWord(m));
	}
	
	public void copy(Operand o1, Memory m) {
		m.getWord(index).copy(o1.getWord(m));
	}
}
