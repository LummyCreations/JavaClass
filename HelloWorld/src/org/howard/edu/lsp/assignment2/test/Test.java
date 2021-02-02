package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.*;

/**
 * 
 * @author Tolulope Akinlabi
 * @version 1.0
 * @since 02-01-2021
 *  
 */

public class Test extends Combination {
	
	/**
	 * 
	 * @param args
	 * @author Tolulope Akinlabi
	 */
	
	
	//DriverCode - Invokes and test implementation
	
	public static void main (String[] args){
		
		//if array is empty, return a note
		if(numArrayOne.size() == 0) {
			System.out.println("Empty Array");
			return;
		}
		
		if(numArrayTwo.size() == 0) {
			System.out.println("Empty Array");
			return;
		}
		

		//print all the possible sum combinations of arrayOne
		
		for (int i=0; i < numArrayOne.size(); i++) {
			
			System.out.println("(");
			for (int j = 0; j < numArrayOne.size(); j++) {
				System.out.println(numArrayOne.get(i).get(j) + " ");
			}
			
			System.out.println(")");
		}
		
		
		// print all possible combination of arrayTwo
		
		for (int a = 0; a < numArrayTwo.size(); a++) {
			
			System.out.println("(");
			for (int b = 0; b < numArrayTwo.size(); b++) {
				System.out.println(numArrayTwo.get(a).get(b) + " ");
			}
			
			System.out.println(")");
		}
	}	
}