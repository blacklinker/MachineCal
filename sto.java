
public class sto extends Instruction{
	private int register;
	private int s1;
	
	public sto(String store, String s1) {
		this.s1 = Integer.parseInt(s1);
		register = Integer.parseInt(store);		
		num[register] = this.s1;
		
	}	
}
