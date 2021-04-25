package com.innovation.problems;

import java.util.Arrays;

public class Anagrams {
	
	public static boolean checkAnagramSort(String firstStr,String secondStr)
	{
		char[] charFirst=firstStr.toCharArray();
		char[] charSecond=secondStr.toCharArray();
		Arrays.sort(charFirst);
		Arrays.sort(charSecond);
		return Arrays.equals(charFirst,charSecond);
	}
	
	public static boolean checkAnagramCCharArray(String firstStr,String secondStr)
	{
        int[] charCount=new int[256];
        if(firstStr.length()!=secondStr.length()) return false;
		for(int lVar=0;lVar<firstStr.length();lVar++)
		{
			charCount[firstStr.charAt(lVar)-'a']++;
			charCount[secondStr.charAt(lVar)-'a']--;
			
		}
		for(int co:charCount)
		{
			if(co!=0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAnagramSort("anagram","nagaram"));
		System.out.println(checkAnagramCCharArray("anagram","nagaram"));
	}

}
