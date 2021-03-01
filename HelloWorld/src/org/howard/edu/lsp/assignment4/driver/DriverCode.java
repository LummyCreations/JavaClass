package org.howard.edu.lsp.assignment4.driver;
import org.howard.edu.lsp.assignment4.integerset.*;
import java.io.*; 
import java.util.*; 
  
/**
 * 
 * @author Tolulope Akinlabi
 *
 */
//Creating the driver class
public class DriverCode{ 
	
	//setting the implementation class integerset to a driver set
	static IntegerSet driver = new IntegerSet();
	
	
	/**
	 * 
	 * @param args
	 * @author Tolulope Akinlabi
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//calling the lengthOfArray Method
		IntegerSet.lengthOfArray();
		
		//calling the set comparison Method
		IntegerSet.equalSet();
		
		//calling the maximum value of a set
		IntegerSet.largest();
		
		//calling the minimum value of a set
		IntegerSet.smallest();
		
		//calling add element function
		IntegerSet.add();
		
		//calling the remove element function
		IntegerSet.remove();
		
		//Calling the union method
		IntegerSet.union();
		
		//Calling the intersection method
		IntegerSet.intersect();
		
		//Calling the difference method
		IntegerSet.difference();
		
		//Calling the isEmpty method
		IntegerSet.isEmpty();
		
		//Calling the isString method
		IntegerSet.isString();
	}
}