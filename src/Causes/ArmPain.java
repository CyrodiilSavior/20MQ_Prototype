package Causes;

import BaseParts.Cause;

public class ArmPain {
	String[] questionsToAsk = {"Did you fall on an outstreatched hand?","Can you bend your arm?"};
	Cause brokenArm = new Cause("BrokenArm",questionsToAsk);
	
	public Cause getCauseInfo(){
		return brokenArm;
	}
	
}
