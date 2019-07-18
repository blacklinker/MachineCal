
public class out extends Instruction{
	private int register;
	
	public out(String store) {
		register = Integer.parseInt(store);	
		System.out.println(num[register]);
		
	}	

	
}
