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
	 * @param  
	 */
	
	//Drive the combination class and prints the in
	public static void main(String[] args) {
			int ranSum;
		Combination comboArray = new Combination(); 
		
		//loop to add numbers in the array
		int a, b;
		for (int a, b: numArray) { 
			  ranSum = a + b ;
        } 
		
		//test the values if it sums up to the target value
		if ( ranSum == comboArray.temp) {
			System.out.println(a + " ," + b);
		}
	}
		
}