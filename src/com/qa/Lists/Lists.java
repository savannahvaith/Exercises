package com.qa.Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>(); 
		
		nameList.add("Savannah 1");
		nameList.add("Savannah 2");
		nameList.add("Savannah 3");
		nameList.add("Savannah 4");	
		nameList.add("Savannah 5");
		
		System.out.println(nameList);
		nameList.remove(0); 
		System.out.println(nameList);
		
		String[] namesArray = {"Sav","vin","bob","rob"}; 
		System.out.println(namesArray[0]);
		
	}

}
