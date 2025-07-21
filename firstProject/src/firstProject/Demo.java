package firstProject;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Thisnis my first repository");
		System.out.println("Thisnis my first repository");
		
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> jh = new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Deoghar");
		jh.add("Lohardaga");
		
		List<List<String>> india = new ArrayList<>();
		india.add(mh);
		india.add(jh);
		
		//Using forEach loop
		for(List<String> states : india)
		{
			for(String dist : states)
			{
				System.out.println(dist);
			}
		}
		
		//Using Lambda Expression reference
		System.out.println("\nLambda Expression 1st way");
		india.forEach((states)->states.forEach((dist)->System.out.println(dist)));
		
		System.out.println("\nLambda Expression 2st way");
		india.forEach(states2 ->
					  states2.forEach ( dist2 ->
					  System.out.println(dist2)
				));
		
		//Using Method Reference 
		System.out.println("\nMethod Reference");
		india.forEach((states)->states.forEach(System.out::println));
	}
}
