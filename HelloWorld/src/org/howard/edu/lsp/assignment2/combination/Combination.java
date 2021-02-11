package org.howard.edu.lsp.assignment2.combination;
import java.io.*;
import java.util.*;

/**
 * 
 * @author Tolulope Akinlabi
 *
 */


public class Combination {
	
	//Algorithm :
	//Create a populated List 
	//Loop through the list find the maximum number
	//Check for duplicate values
	//find the sum of a random number in the array
	//if values in the array equals a targeted max sum
	//print their index
	

	public static final int temp = 0;

	/**
	 * 
	 * @param args
	 */
	public static void combArray(String[] args){
		
			//create and populate the array
		  int [] numArray= {10,20,30,40,50}; 
		  
		  //loop through to find the max num
		  int temp, size;
		  size = numArray.length;

	      for(int i = 0; i < size; i++ ){
	          for(int j = i+1; j < size; j++){
	             if(numArray[i] > numArray[j]){
	                temp = numArray[i];
	                numArray[i] = numArray[j];
	                numArray[j] = temp;
	             }
	          }
	        }
	   }
	      
	      //Check for duplicates in the numbers
	      /**
	       * 
	       * @param <T> used to check the duplicates
	       * @param numArray
	       * @return
	       * @author Tolulope Akinlabi
	       */
	     
	      private static <T> boolean checkForDuplicates(T... numArray)
	      {
	          //sort the array in natural or reverse order
	          Arrays.sort(numArray);
	       
	          // previous stores the previous element for current element in the array
	          T prev = null;
	       
	          // do for every element in the array
	          for (T e : numArray)
	          {
	              // if two consecutive elements is found to be equal,
	              // duplicate is found
	              if (e != null && e.equals(prev))
	                  return true;
	       
	              // set current element as previous
	              prev = e;
	          }
	       
	          // no duplicate found
	          return false;
	         
	}

		
}