package com.example.patterns.structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	private static final Map<String, TreeType> TREE_TYPES = new HashMap<>();

	public static TreeType getTreeType(String name, Color color, String otherTreeData) {
		TreeType result = TREE_TYPES.get(name);
		if (result == null) {
			result = new TreeType(name, color, otherTreeData);
			TREE_TYPES.put(name, result);
		}
		return result;
	}
}
