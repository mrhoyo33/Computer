package software;

import hardware.Address;
import hardware.Memory;
import hardware.Operand;

public class Copy {
	protected Operand o1;
	protected Address a;
	
	public Copy(Operand op1, Address address) {
		o1 = op1;
		a = address;
	}

	public void performInstruction(Memory m) {
		a.getWord(m).copy(o1.getWord(m));
	}

}