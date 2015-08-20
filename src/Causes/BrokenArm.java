package Causes;

import BaseParts.Cause;

public class BrokenArm {
	String[] questionsToAsk = {"Did you fall on an outstreatched hand?","Can you bend your arm easily?"};
	Cause brokenArm = new Cause("Broken Arm",questionsToAsk);
	
	public Cause getCauseInfo(){
		return brokenArm;
	}
	
}
