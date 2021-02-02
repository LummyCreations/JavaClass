package org.howard.edu.lsp.assignment2.combination;
import java.io.*;
import java.util.*;

/**
 * 
 * @author Tolulope Akinlabi
 * @version 1.0
 * @since 02-01-2021
 *  
 */

public class Combination {
	
	/**
	 * 
	 * @param args
	 * @author Tolulope Akinlabi
	 */
	
	public static void newArray(String[] args) { 
		
		//initializing arrays and target value
		int[] numArrayOne = {2,4,6,8,10,12};
		int[] numArrayTwo = {10,20,30,40,50,60,70};
		
		int targetOfArrayOne = 12;
		int targetOfArrayTwo = 70;
		int[] checker;
		int[] check;
		
		//Check that sum in Array One does not become negative
		for (int i = 0; i < numArrayOne.size(); i++) {
			
			if ((targetOfArrayOne - numArrayOne.get(i)) >= 0) {
				checker.add(numArrayOne.get(i));
			}
		}
		
		//Check that sum in Array Two does not become negative
		
		for (int a = 0; a < numArrayTwo.size(); a++) {
			
			if ((targetOfArrayTwo - numArrayTwo.get(a)) >= 0) {
				check.add(numArrayOne.get(a));
			}
		}
	}
}