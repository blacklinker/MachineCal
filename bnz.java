import java.util.ArrayList;

public class bnz extends Instruction{
	static String jump;
	private static int register;
	
	
	public bnz(String s1) {
		register = Integer.parseInt(s1);
	}
	public static int check(String s1, int i, ArrayList read) {
		
		if(num[register]!=0) {
			for(int j=0;j<read.size();j++) {
				if(read.get(j).equals(read.get(i+2))){
					return j;
				}
			}
		}
		return -1;
		
	}
	
	
	
}
	
