package Causes;

import BaseParts.Cause;

public class HerniatedDisk {

	String[] questionsToAsk = {"Do you expirience Tingling along with the Pain?","Do you feel weakness in the arm?"};
	Cause herniatedDisk = new Cause("Herniated Disk",questionsToAsk);
	
	public Cause getCauseInfo(){
		return herniatedDisk;
	}
	
	
}
