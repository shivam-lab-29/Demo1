package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 
{
	public static void main(String[] args) 
	{
		
		
		  String s="Pooja"; 
		  s.chars().mapToObj(c->(char)
		  c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
		  entrySet().forEach(System.out::println);
		 
		
		ArrayList<Empployee> l=new ArrayList<>();
		l.add(new Empployee("E1", "M", 45));
		l.add(new Empployee("E2", "F", 35));
		l.add(new Empployee("E3", "M", 50));
		
		List<Empployee> ret= l.stream().filter(e->e.getGender().equalsIgnoreCase("M") && e.getAge()>40).collect(Collectors.toList());
		
		for(Empployee e:ret)
		{
			System.out.println(e.getName());
		}
	}

}
