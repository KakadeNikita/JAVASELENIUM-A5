package org.webdriver_method;

import java.util.HashSet;
import java.util.Set;

public class ForEach {
	public static void main(String[] args) {
		String[] ipl= {"RCB","MI","CSK","DC","GT"};
		for(String x:ipl) {
			System.out.println(x);
		}
		
		Set<String> heros=new HashSet<String>();
		heros.add("SRK");
		heros.add("Allu arjun");
		heros.add("Yash");
		System.out.println(heros);
		
		for(String hero: heros )
		{
			System.out.println(hero);
		}
		
	}

}
