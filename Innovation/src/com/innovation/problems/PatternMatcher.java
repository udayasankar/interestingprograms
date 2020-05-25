package com.innovation.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		
		Pattern pat=Pattern.compile("TEST");
		Matcher m=pat.matcher("THIS IS A TEST TEXT");
		if(m.find())
		{
			System.out.println(m.group(0));
            int s1 = m.start(0);
            int e1 = m.end(0);
            System.out.println("THIS IS A TEST TEXT".substring(s1, e1));
		}
				


	}

}
