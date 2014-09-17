package software;

import hardware.Address;
import hardware.Memory;
import hardware.Operand;

public class Mul extends ArithmeticInstruction {

	public Mul(Operand op1, Operand op2, Address address) {
		super(op1, op2, address);
	}

	public void performInstruction(Memory m) {
		a.getWord(m).mul(o1.getWord(m), o2.getWord(m));
	}

}
