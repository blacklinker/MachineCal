
public class Instruction {
	protected static int[] num = new int[32];
	
	public void Instruction() {
		for(int i=0;i<num.length;i++) {
			num[i]=0;
		}
	}
	
	public void pr() {
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}
	
}



