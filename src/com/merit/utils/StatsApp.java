package com.merit.utils;

public class StatsApp {
	
	
	public static void main(String[] args) {
		int[] xArr = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] yArr = {2, 6, 9, 10, 12, 16, 17, 21};
		
		System.out.print("X : ");
		printArray(xArr);
		System.out.print("Y : ");
		printArray(yArr);
		
		System.out.print("Pearson: ");
		System.out.println(PearsonCoefficient.getPearsonCoefficient(xArr, yArr));
		
		System.out.print("Slope: ");
		System.out.println(LinearReg.getSlope(xArr, yArr));
		
		System.out.print("Y-Intercept: ");
		System.out.println(LinearReg.getIntercept(xArr, yArr));
		
		System.out.println("Mean: " + Stats.findMean(xArr));
		System.out.println("Median: " + Stats.findMedian(xArr));
		System.out.print("Mode: ");
		Stats.findMode(xArr);
		System.out.println("Range: " + Stats.findRange(xArr, xArr.length));
		System.out.println("IQ Range: " + IQRange.getIQRange(xArr));
		System.out.println("Variance: " + Stats.getVariance(xArr));
		System.out.println("Standard Dev: " + Stats.getStandardDeviation(xArr));
	}
		
		public static void printArray(int[] arr) {
			for(int i : arr) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
