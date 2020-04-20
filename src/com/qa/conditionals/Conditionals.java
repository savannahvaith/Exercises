package com.qa.conditionals;

public class Conditionals {

	public int sum(int a, int b, boolean isIt) {
		int result = 0; 
		if(isIt) {
			result = a+b; 
		}else {
		result = a * b; 		
		}
		return result; 
	}	
	
}
