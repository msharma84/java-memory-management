package com.memoryleak;

import java.util.HashMap;
import java.util.Map;

public class MapManager {

	Map<Object,Object> map = new HashMap<>();
	
	public void grow() {
		
		try {
			long counter = 0;
			
			while(true) {
				map.put("key"+counter, "Large String ssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss"
						+ "sssssssssssssssssssssssssssssssssss");
				counter++;
			}
		}catch(Exception e) {
			
		}
	}
}
