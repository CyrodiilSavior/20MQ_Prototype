package Symptoms;

import java.util.*;
import BaseParts.Cause;
import Causes.*;
import java.util.Random;

public class ArmPain_SYM{

	public static void init(){
		System.out.println("Starting new Questionnaire Session...");
		
		System.out.println("Pulling in all Possible Causes for Sympom");
		
			BrokenArm brokenArm = new BrokenArm();
			HerniatedDisk herniatedDisk = new HerniatedDisk();
			Cause[] causes = new Cause[2];
				causes[0] = brokenArm.getCauseInfo();
				causes[1] = herniatedDisk.getCauseInfo();

		System.out.println("______________________________");
		System.out.println("Youre Possible Causes:");
			for(int i =0; i<causes.length;i++){
				Cause temp = causes[i];
				temp.getName();
			}
		System.out.println("______________________________");	
		
		//Begin Asking Questions...
		while(true){
			
			int min = 0;
			int max = causes.length;
			Random rn = new Random();
			int numToAsk = rn.nextInt(max - min + 1) + min;
			causes[numToAsk].askQuestion();
			
		}
		

			
			

		
	}
	
}
