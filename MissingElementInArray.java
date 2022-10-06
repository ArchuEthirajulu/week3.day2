package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		List<Integer>List= new ArrayList<Integer>();
		for (Integer data : arr) {
			List.add(data);
		}
		System.out.println("before sorting:" + List);
		
		Collections.sort(List);
		System.out.println("After sorting the list:" + List);
		
		for (Integer i : List) {
			if(List.get(i)!=(i+1)) {
				System.out.println("Missing Element Array:" + (i+1));
				break;
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		        // Here is the input
				//int[] array = {1,2,3,4,7,6,8};
		       // Sort the array	
			   // loop through the array (start i from arr[0] till the length of the array)
		      // check if the iterator variable is not equal to the array values respectively
			// print the number
		   // once printed break the iteration
				
				
				
	}
}

