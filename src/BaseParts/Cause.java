package BaseParts;


public class Cause {

	private String name = null;
	private String[] q;
	private int likelyPercent;
	Question[]

	public Cause(String myName, String[] questions) {
		name = myName;
		q = questions;
		likelyPercent = 50;
	}
	
	public void askQuestion(){
		System.out.println()
	}
	
	public void setPercent(int percent){
		likelyPercent = percent;
	}
	
	public void getName(){
		System.out.println(name);
	}
	
}
