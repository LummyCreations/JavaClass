package org.howard.edu.lsp.exam.question41;
import java.util.*;

public class RemoveZeros{
	/**
	 * 
	 * @param args
	 * @author Tolulope Akinlabi
	 * 
	 * Method takes an list of element with duplicate 0s
	 * Stores the list of element into variable number
	 * Strips the list of all 0 values 
	 * Stores the result in a new list 
	 */
	public static void main(String[] args) {
		
		Integer[] numbers = {0, 7, 2, 0, 0, 4, 0};
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
		
		list.removeAll(Arrays.asList(Integer.valueOf(0)));
		
		numbers = list.toArray(new Integer[list.size()]);
		
		System.out.println(Arrays.toString(numbers));
		
	}
	
}