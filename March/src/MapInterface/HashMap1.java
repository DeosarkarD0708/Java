package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	
	public static void main(String[]args) {
		
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		
		HashMap HM1 = new HashMap();
		
		HM.put(105, "Ojas");
		HM.put(108, "Ovi");
		HM.put(104, "Shreya");
		HM.put(109, "Soham");
		HM.put(102, "Ruhi");
		
		System.out.println(HM);
		System.out.println(HM.get(108));
		System.out.println(HM.get("Ruhi"));
		
		System.out.println(HM.containsKey(105));
		System.out.println("******************");
		
		System.out.println(HM.containsValue("Ojas"));
		System.out.println(HM.containsValue("Siya"));
		System.out.println("***********************");
		
		System.out.println(HM.isEmpty());
		System.out.println(HM1.isEmpty());
		
		System.out.println(HM.remove(104));
		
		System.out.println(HM.keySet());
		System.out.println(HM.values());
		System.out.println("******************");
		
		//Read data
		
		for(Object obj : HM.keySet()) {
			System.out.println(obj);
		}
		
		for(Object obj1 : HM.values()) {
			System.out.println(obj1);
		}
		
	System.out.println("***************");
	
	//Read data through Entry Method
	
	for(Map.Entry entry : HM.entrySet()) {
		
		System.out.println(entry.getKey()+" "+entry.getValue());
		
	}

	
	for(Entry<Integer, String> entry: HM.entrySet())
    {
    	System.out.println(entry.getKey()+" "+entry.getValue());

	}
	
	System.out.println("****************************");
	
	//Iterator
	
	Set S = HM.entrySet();
	
	Iterator it = S.iterator();
	
	while(it.hasNext()) {
		Map.Entry entry = (Entry) it.next();
		
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
}
}