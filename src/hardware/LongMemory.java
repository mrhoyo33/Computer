package hardware;

public class LongMemory extends Memory {
	
	public LongMemory(int aSize) {
		memory = new LongWord[aSize];
	}
	
	public Word getWord(int aIndex) {
		return memory[aIndex];
	}
}
