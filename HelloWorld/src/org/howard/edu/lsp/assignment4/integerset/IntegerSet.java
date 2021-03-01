package org.howard.edu.lsp.assignment4.integerset;
import java.util.*; 


/**
 * 
 * @author Tolulope Akinlabi
 *
 */

//Declare a new class called integer 
public class IntegerSet { 

	//Instantiating and populating array list name.
	/**
	 * 
	 * 
	 * @author Tolulope Akinlabi
	 */
	public static void lengthOfArray(){
		//Declare the integer
		List<Integer> set = new ArrayList<Integer>();		
			set.add(5);
			set.add(15);
			set.add(10);
			set.add(20);
			set.add(30);
			set.add(25);
			
			int sizeOfArray = set.size();
		//get array length using the size command
		System.out.println("Length of Array is: " + sizeOfArray);
	}
	
	
	/**
	 * 
	 * @return
	 * @author Tolulope Akinlabi
	 */
	//Comparing two sets if they are equal
	public static boolean equalSet(){
		//Initializing set 1
		String arr[] = { "T", "O", "L", "U", "L", "O", "P", "E"};
	      Set<String> set1 = new HashSet<String>(Arrays.asList(arr));
	     
	     //Initializing set 2
	      arr = new String[] { "T", "O", "L", "U", "L", "O", "P", "E"};
	      Set<String> set2 = new HashSet<String>(Arrays.asList(arr));
	      
	      //Initializing set 3
	      String arry[] = { "A", "K", "I", "N", "L", "A", "B", "I"};
	      Set<String> set3 = new HashSet<String>(Arrays.asList(arry));
	      
	      //Prints the result if both set are equal
	      System.out.println("Both the sets 1 & 2 are equal? = "+set1.equals(set2));
	      System.out.println("Both the sets are 1 & 3 equal? = "+set1.equals(set3));
		return false;
	} 
	
    
	/**
	 * 
	 * @throws Exception
	 * @author Tolulope Akinlabi
	 */
	//returns maximum value of a set
	public static void largest() throws Exception 
	{ 
		
		try {
	        // create an empty set 
	        Set<Integer> large = new HashSet<Integer>(); 
	  
	        // fill the hashSet using the add method
	        large.add(13); 
	        large.add(61); 
	        large.add(21); 
	        large.add(19); 
	        
	        // getting maximum value 
	        // using max() method 
	        int maxSet = Collections.max(large);
	  
	        // printing the maximum value 
	        System.out.println("Maximum value of set is: "  + maxSet);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    } finally {
	      System.out.println("The 'try catch' is finished.");
	    }
	}
		
		
		/**
		 * 
		 * @throws Exception
		 * @author Tolulope Akinlabi
		 */
		//returns maximum and minimum value of a set
		public static void smallest() throws Exception 
		{ 
			
			try {
		        // Get the HashSet 
		        Set<Integer> small = new HashSet<Integer>(); 
		  
		        // fill the hashSet 
		        small.add(13); 
		        small.add(61); 
		        small.add(21); 
		        small.add(19); 
		   
		        // getting minimum value 
		        // using min() method 
		        int minSet = Collections.min(small); 
		  	  
		        // printing the minimum value 
		        System.out.println("Minimum value of set is: " + minSet); 
		 
		    } catch (Exception e) {
		      System.out.println("Array is empty.");
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		}
		
		/**
		 * 
		 * 
		 * @author Tolulope Akinlabi
		 * @return 
		 */
		//Adds an element to a set if it doesn't exist otherwise returns false
		public static void add(){ 
	        // Creating an empty Set 
	        Set<String> addVal = new HashSet<String>(); 
	        
	        //add value to the empty set using the add method
	        addVal.add("Welcome");
	        addVal.add("Home");
	        System.out.println(addVal);
	        return;
		}
		
		/**
		 * 
		 * 
		 * @author Tolulope Akinlabi
		 */
		//Adds an element to a set if it doesn't exist otherwise returns false
		public static void remove(){ 
	        // Creating an empty Set 
	        Set<String> remVal = new HashSet<String>(); 
	        
	        //add value to the empty set using the add method
	        remVal.add("Welcome");
	        remVal.add("Home");
	        remVal.add("Boy");
	        System.out.println(remVal);

	        
	        //Removes element from the element
	        remVal.remove("Boy");
	        System.out.println(remVal);
	        return;
		}
		
		/**
		 * 
		 * 
		 * @author Tolulope Akinlabi
		 */
		//Method gets the union of two sets
		public static void union(){
			//Declare the first integer set
			List<Integer> anotherSet = new ArrayList<Integer>();
			anotherSet.add(30);
			anotherSet.add(150);
			anotherSet.add(18);
			anotherSet.add(134);
			
			//Declare another Integer set
			List<Integer> newSet = new ArrayList<Integer>();
			newSet.add(6);
			newSet.add(150);
			newSet.add(13);
			newSet.add(1);
			newSet.add(145);
			
			//getting the union of both set
			System.out.println("First Set = "+ anotherSet);
			System.out.println("Second Set = "+ newSet);
		    anotherSet.addAll(newSet);
		    System.out.println("Union of both sets = "+ anotherSet);
		}
		
		
		/**
		 * 
		 * 
		 * @author Tolulope Akinlabi
		 */
		//Method gets the union of two sets
		public static void intersect(){
			//Declare the first integer set
			List<Integer> anotherSet = new ArrayList<Integer>();
			anotherSet.add(30);
			anotherSet.add(150);
			anotherSet.add(18);
			anotherSet.add(134);
			
			//Declare another Integer set
			List<Integer> newSet = new ArrayList<Integer>();
			newSet.add(6);
			newSet.add(150);
			newSet.add(13);
			newSet.add(1);
			newSet.add(145);
			
			//getting the union of both set
		    anotherSet.retainAll(newSet);
		    System.out.println("Intersection of both set = "+ anotherSet);
		}
		
		
		/**
		 * 
		 * 
		 * @author Tolulope Akinlabi
		 */
		//Method gets the union of two sets
		public static void difference(){
			//Declare the first integer set
			Set<Integer> anotherSet = new HashSet<>();
			anotherSet.add(30);
			anotherSet.add(150);
			anotherSet.add(18);
			anotherSet.add(134);
			
			//Declare another Integer set
			Set<Integer> newSet = new HashSet<>();
			newSet.add(6);
			newSet.add(150);
			newSet.add(13);
			newSet.add(1);
			newSet.add(145);
			
			//getting the union of both set
		    anotherSet.removeAll(newSet);
		    System.out.println("Difference of both sets = "+ anotherSet);
		}
		
		/**
		 * 
		 * @return
		 * @author Tolulope Akinlabi
		 */
		//Method checks the if a set id empty and returns true or false
		public static boolean isEmpty(){
			ArrayList<Integer> emptySet = new ArrayList<Integer>();
			
			// check if the list is empty or not using function 
	        boolean ans = emptySet.isEmpty(); 
	        if (ans == true) 
	            System.out.println("Array empty ? " + ans);  
			return ans;
	       
	    } 
		
		
		/**
		 * 
		 * 
		 * @author Tolulope Akinlabi
		 */
		//Converts a set of integer to string
		public static void isString() {
			// Creating an Empty HashSet 
	        HashSet<Integer> convertToString = new HashSet<Integer>(); 
	  
	        // Use add() method 
	        // to add elements to the Collection 
	        convertToString.add(10); 
	        convertToString.add(20); 
	        convertToString.add(30); 
	        convertToString.add(40); 
	  
	        // Using toString() method 
	        System.out.println("Integer values are : " + convertToString);
	        System.out.println("Integer to String : " + convertToString.toString()); 
	    } 

  } 
