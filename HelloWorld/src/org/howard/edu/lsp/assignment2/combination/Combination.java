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
	//if values in the array equals a targeted max sum
	//print their index
	
	
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



}