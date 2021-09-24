// Java code to demonstrate SortedMap Interface
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args)
	{
		SortedMap<Integer, String> sm
			= new TreeMap<Integer, String>();
		sm.put(new Integer(2), "Shubham");
		sm.put(new Integer(3), "kumar");
		sm.put(new Integer(5), "yash");
		sm.put(new Integer(4), "nihal");
		sm.put(new Integer(1), "saloni");
		Set s = sm.entrySet();

		// Using iterator in SortedMap
		Iterator i = s.iterator();
        
		while (i.hasNext()) {
			Map.Entry m = (Map.Entry)i.next();

			int key = (Integer)m.getKey();
			String value = (String)m.getValue();

			System.out.println("id : " + key
							+ " name : " + value);
		}
	}
}
