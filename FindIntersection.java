package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		
		
		int [] array1= { 3,2,11,4,6,7};
		int [] array2 = { 1,2,8,4,9,7};
		
		List<Integer> List1 = new ArrayList<Integer>();
		for (Integer eachData : array1) {
			List1.add(eachData);
			}
		System.out.println("Enter the List1:" + List1);
		
		
		List<Integer> List2 = new ArrayList<Integer>();
		for (Integer eachData : array2) {
			List2.add(eachData);
			}
		
		System.out.println("Enter the List2:" + List2);
		
		for(int i=0; i<List1.size();i++) {
			for(int j=0; j<List2.size();j++) {
				if(List1.get(i).equals(List2.get(j))) {
					System.out.println(List1.get(i));
				}
		}
        
	
	
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
	}

}
