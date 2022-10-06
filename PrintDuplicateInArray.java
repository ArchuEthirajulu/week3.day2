package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer>value= new ArrayList<Integer>();
		for (Integer eachData : arr) {
			value.add(eachData);
		}
		Collections.sort(value);
		System.out.println("order :" + value);
		
		
		
	for(int i =1 ; i < value.size(); i++) {
		if(value.get(i-1) == value.get(i)) {
			System.out.println(value.get(i));
		}
	}
		
	
	
	
	
	// get the length of the array
	// declare an int variable named count
	// iterate from 0 to the array length-1 (outer loop starts here)
	// assign 0 to count 
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	// compare both the loop variables & check they're equal
	// increase the count if both the arrays are equal
	// Out of the inner loop, check and print the first array variable if count is more than 0
	
	
	
		
		
		
		
	}
}
