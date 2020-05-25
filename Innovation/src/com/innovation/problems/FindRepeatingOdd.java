package com.innovation.problems;

public class FindRepeatingOdd {
	
	public static int findOdd(int[] arr)
	{
		int finalValue=0;
		for(int loopVar=0;loopVar<arr.length;loopVar++)
		{
			finalValue = finalValue ^ arr[loopVar];
			System.out.println(finalValue);
		}
		return finalValue;
	}
	
	public static void main(String[] args)
	{
		int arr[] = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };
		System.out.println(findOdd(arr));
	}

}
