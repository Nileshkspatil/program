package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P1 {
	
	private static final Function String = null;
	private static final Function Double = null;

	public static void main(String[] args) {
		
		Map<String  , Double > m =new HashMap<>();
		
		m.put("java",  20000.00);
		m.put("python", 3500.98);
		m.put("dot.net", 5500.90);
		
		Set s=m.entrySet();
		
		for( Object ob :s)
		{
			System.out.println(ob);
			
		}
		
	//	Map< String, Double> res=m.stream().filter(p->p.Double >4000.00).collect(Collectors.toMap(String, Double));
		
	}

}
