package software;

import hardware.Memory;

import java.util.ArrayList;

public abstract class Program {
	private ArrayList<Instruction> instructionList;
	private ProgramCounter pc;
	
	public Program() {
		instructionList = new ArrayList<Instruction>();
		pc = new ProgramCounter();
	}
	
	public void add(Instruction i) {
		instructionList.add(i);
	}
	
	private void execute(Memory Mem) {
		
	}
}
