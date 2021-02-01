package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.*;

public class Test extends Combination {
	
	//DriverCode - Invokes and test implementation
	
	public static void main (String[] args){
		
		//Print result for first array
		System.out.println(numArrayOne[0] + numArrayOne[1] + numArrayOne[2]);
		System.out.println(numArrayOne[0] + numArrayOne[4]);
		System.out.println(numArrayOne[1] + numArrayOne[3]);
		System.out.println(numArrayOne[2] + numArrayOne[2]);
		System.out.println(numArrayOne[5]);
		
		//Print result for second array
		System.out.println(numArrayTwo[0] + numArrayTwo[1] + numArrayTwo[3]);
		System.out.println(numArrayTwo[0] + numArrayTwo[5]);
		System.out.println(numArrayTwo[1] + numArrayTwo[4]);
		System.out.println(numArrayTwo[2] + numArrayTwo[3]);
		System.out.println(numArrayTwo[6]);
	}
	
}