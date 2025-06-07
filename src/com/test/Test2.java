package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
		String s="abbca";
		
		int count=0;
		int flg=0;
		List<Character> lst=new ArrayList<>();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			String sub_str=s.substring(i+1);
			for(int j=0;j<sub_str.length();j++)
			{
				if(sub_str.charAt(j)==c)
				{
					flg=1;
					break;
				}
			}
			if(flg==0)
			{
				System.out.println(c);
				
			}
		}
	}

}
