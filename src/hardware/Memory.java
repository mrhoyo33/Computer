package hardware;

public abstract class Memory {
	Word memory[];
	
	public Word getWord(int aIndex) {
		return memory[aIndex];
	}
}
