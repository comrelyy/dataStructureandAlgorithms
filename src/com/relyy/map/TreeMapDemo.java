package com.relyy.map;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Description
 * @Created by cairuirui
 * @Date 2021/4/18
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("1",1);
		treeMap.put("2",2);
		treeMap.put("3",3);
		treeMap.put("4",4);
		SortedMap<String, Integer> sortedMap = treeMap.subMap("2\0", "3\0");
		SortedMap<String, Integer> sortedMap1 = treeMap.subMap("2", "3\0");
		SortedMap<String, Integer> sortedMap2 = treeMap.subMap("2", "3");

		SortedMap<String, Integer> sortedMap3 = treeMap.headMap("3");
		System.out.println(treeMap.ceilingKey("2"));
	}
}
