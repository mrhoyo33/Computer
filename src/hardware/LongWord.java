package hardware;

public class LongWord extends Word {
	protected long value;
	
	public Word getWord(Memory m) {
		return this;
	}
	
	public long getValue() {
		return value;
	}
	
	public LongWord(long arg) {
		value = arg;
	}

	public void add(Word w1, Word w2) {
		LongWord t1 = (LongWord)w1;
		LongWord t2 = (LongWord)w2;
		value = t1.value + t2.value;
	}

	public void mul(Word w1, Word w2) {
		LongWord t1 = (LongWord)w1;
		LongWord t2 = (LongWord)w2;
		value = t1.value * t2.value;
	}

	public void copy(Word w1) {
		LongWord t1 = (LongWord)w1;
		value = t1.value;
	}
}
