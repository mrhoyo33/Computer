package hardware;

public abstract class Word {
	public Word getWord(Memory m) {
		return this;
	}
	
	public abstract void add(Word w1, Word w2);
	public abstract void mul(Word w1, Word w2);
	public abstract void copy(Word w1);
}
