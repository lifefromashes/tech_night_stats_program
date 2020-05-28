package com.merit.utils;

import java.util.Arrays;

public class Utils {
	
	public static int getMinValue(int[] arr, int n) {
		Arrays.sort(arr);
		int result = arr[0];
		for(int i = 1; i < n; i++) {
			//result = Math.min(res, arr[i]);
			if (arr[i] < result) { 
				result = arr[i];
			}
		}
		return result;
	}
	
	public static int getMaxValue(int[] arr, int n) {
		int result = arr[0];
		for (int i = 1; i < n; i++) {
			//result = Math.max(result, arr[i]);
			if(arr[i] > result) {
				result = arr[i];
			}
		}
		return result;
	}

}
