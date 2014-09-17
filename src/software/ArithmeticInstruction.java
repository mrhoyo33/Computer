package software;

import hardware.Address;
import hardware.Operand;

public abstract class ArithmeticInstruction {
	protected Operand o1, o2;
	protected Address a;
	
	public ArithmeticInstruction(Operand op1, Operand op2, Address address) {
		o1 = op1;
		o2 = op2;
		a = address;
	}
}
