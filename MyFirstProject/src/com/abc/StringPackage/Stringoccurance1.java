package com.abc.StringPackage;

import java.util.Map;
import java.util.TreeMap;

public class Stringoccurance1 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="gauravbhadane";
		char arr[]=str.toCharArray();
		int count=0;
		Map<Character,Integer>map=new TreeMap<>();
		for(int i=0;i<str.length();i++)
			count=0;
		{
		
			for(int j=0;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			map.put(arr[i], count);
		}
	}

}
