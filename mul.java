
public class mul extends Instruction{
	private int register;
	private int s1;
	private int s2;	
	
	public mul(String store, String s1, String s2) {
		this.s1 = Integer.parseInt(s1);
		this.s2 = Integer.parseInt(s2);
		register = Integer.parseInt(store);		
		num[register] = num[this.s1]*num[this.s2];
		
	}	
	
	
}
