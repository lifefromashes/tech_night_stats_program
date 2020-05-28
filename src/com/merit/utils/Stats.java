package com.merit.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stats {

	public static double findMean(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	public static double findMedian(int[] arr) {
		int middle = arr.length / 2;
		if (arr.length % 2 == 1) {
			return arr[middle];
		} else {
			return (arr[middle - 1] + arr[middle]) / 2.0;
		}
	}

	public static int findMode(int[] array) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxValue = 0;
		int temp = 0;
		int arrLen = array.length;

		for (int i : array) {// = 0; i <arrLen; i++) {
			if (map.get(array[i]) != null) {
				int count = map.get(array[i]);
				count++;
				map.put(array[i], count);

				if (count > maxValue) {
					maxValue = count;
					temp = array[i];
				}
			} else
				map.put(array[i], 1);
		}
		return temp;
	}

	// below only works for finding one mode
//	    int maxValue = 0;
//	    int maxCount = 0;
//
//	    for (int i = 0; i < a.length; ++i) {
//	        int count = 0;
//	        for (int j = 0; j < a.length; ++j) {
//	            if (a[j] == a[i]) ++count;
//	        }
//	        if (count > maxCount) {
//	            maxCount = count;
//	            maxValue = a[i];
//	        }
//	    }
//
//	    return maxValue;
	
	public static double getStandardDeviation(int[] array) {
		double variance = getVariance(array);
		return Math.sqrt(variance);
	}
	
	

	public static int findRange(int[] arr, int n) {
		int max = Utils.getMaxValue(arr, n);
		int min = Utils.getMaxValue(arr, n);

		int range = max - min;
		System.out.println("Range is: " + range);
		return range;

	}

	public static double getVariance(int[] array) {
		double average = findMean(array);
		int variance = 0;
		for (int i : array) {
			variance += (i - average) * (i - average);
		}
		return variance / array.length;
	}

	public static void sort(int[] values) {
		int[] numbers;
		int number;
		if (values == null || values.length == 0) {
			return;
		}
		numbers = values;
		number = values.length;
		quickSortArray(0, number - 1);
	}

	public static void quickSortArray(int low, int high) {
		int[] numbers = new int[] {};
		int i = low;
		int j = high;
		int pivot = numbers[low + (high - low) / 2];

		// divide the two lists
		while (i <= j) {
			// if the curr value form left list is smaller than pivot
			// then get the next element from left list
			while (numbers[i] < pivot) {
				i++;
			}
			// if curr value from right list is larger than the pivot
			// then get the next element from right list
			while (numbers[i] > pivot) {
				j--;
			}
			// If we have found a value in the left list which is larger than
			// the pivot element and if we have found a value in the right list
			// which is smaller than the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSortArray(low, j);
		}
		if(i < high) {
			quickSortArray(i, high);
			
		}
	}
	
	public static void exchange(int i, int j) {
		int[] numbers = new int[] {};
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}



//	public static List<Integer> mode(final int[] numbers) {
//	    final List<Integer> modes = new ArrayList<Integer>();
//	    final Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
//
//	    int max = -1;
//
//	    for (final int n : numbers) {
//	        int count = 0;
//
//	        if (countMap.containsKey(n)) {
//	            count = countMap.get(n) + 1;
//	        } else {
//	            count = 1;
//	        }
//
//	        countMap.put(n, count);
//
//	        if (count > max) {
//	            max = count;
//	        }
//	    }
//
//	    for (final Map.Entry<Integer, Integer> tuple : countMap.entrySet()) {
//	        if (tuple.getValue() == max) {
//	            modes.add(tuple.getKey());
//	        }
//	    }
//
//	    return modes;
//	}

}
