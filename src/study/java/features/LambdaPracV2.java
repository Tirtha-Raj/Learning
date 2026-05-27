package study.java.features;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaPracV2 {
	public static void main(String[] args) {
//		Sort a hashmap by values in java
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 40);
		map.put("B", 10);
		map.put("C", 30);
		map.put("D", 20);
		
		LinkedHashMap<String, Integer> sortedValuesMap = map.entrySet().stream()
																		.sorted(Map.Entry.comparingByValue())
																		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));
		System.out.println("Sort a hashmap by values"  +sortedValuesMap.toString());
																		

	}
}
