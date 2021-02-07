package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.*;	       

/**
 * 
 * @author Tolulope Akinlabi
 *
 */

public class Test extends Combination {
	
	/**
	 * 
	 * @param args
	 */
	
	//Drive the combination class and prints the in
	public static void main(String[] args) {
			
		Combination comboArray = new Combination(); 
		
		//if array is empty, return a note
				if(comboArray.numArray == 0) {
					System.out.println("Empty Array");
					return;
				}

				//print all the possible sum combinations of the array
				
				for (int i=0; i < comboArray.numArray.length; i++) {
					
					System.out.println("(");
					for (int j = 0; j <comboArray.numArray.length; j++) {
						System.out.println(comboArray.numArray.length.get(i).get(j) + " ");
					}
					
					System.out.println(")");
				}
	}
}