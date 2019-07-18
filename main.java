
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
    	
        File file = new File("test.txt");
        ArrayList<String> read = new ArrayList<String>();
        
        try {
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNext()) {
                String tok = scanner.next(); // scanner.next() returns the next
                read.add(tok);
                
                
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println(read);
        Instruction temp;
       
       
        
        
        
        for(int i=0;i<read.size();i++) {
        	
        	if(read.get(i).equals("add")) {
        		temp = new add(read.get(i+1),read.get(i+2),read.get(i+3));
        		i=i+3;
        		
        	}
        	if(read.get(i).equals("sub")) {
        		temp = new sub(read.get(i+1),read.get(i+2),read.get(i+3));
        		i=i+3;
        		
        	}
        	if(read.get(i).equals("mul")) {
        		temp = new mul(read.get(i+1),read.get(i+2),read.get(i+3));
        		i=i+3;
        		
        	}
        	if(read.get(i).equals("div")) {
        		temp = new div(read.get(i+1),read.get(i+2),read.get(i+3));
        		i=i+3;
        		
        	}
        	if(read.get(i).equals("out")) {
        		temp = new out(read.get(i+1));
        		i=i+1;
        		
        	}
        	if(read.get(i).equals("sto")) {
        		temp = new sto(read.get(i+1),read.get(i+2));
        		i=i+2;
        		
        	}
        	if(read.get(i).equals("bnz")) {
        		temp = new bnz(read.get(i+1));
        		int x = bnz.check(read.get(i+1),i,read);
        		if(x==-1) {
        			i=i+2;
        		}
        		else {
        			i=x;
        		}
        		
        	}
        }
     }
   }

