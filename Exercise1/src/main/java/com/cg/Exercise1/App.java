/*
 Program to calculate sum of the digits provided as String
 author-L.S.Kanishka
 */


package com.cg.Exercise1;

import java.util.Arrays;

public class App {

	public int calculate(String input) {
		if(input.isEmpty()) {
			return 0;
		} 		
		else {
			return Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).sum();
		}
	}

}
