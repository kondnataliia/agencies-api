package org.spaceagencies.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataUniqueness {
	private static Map<String, ArrayList<Integer>> offsetsUsed = new HashMap<String, ArrayList<Integer>>();

  public static void nameOffsetMapFilling (String name, Integer offset) {
      if (!offsetsUsed.containsKey(name)) {
          offsetsUsed.put(name, new ArrayList<Integer>());
      }
      offsetsUsed.get(name).add(offset);
  }

  public static boolean isOffsetInMapCheck (String name, Integer offset) {
      if (offsetsUsed.containsKey(name) && offsetsUsed.get(name).contains(offset)) {
          return true;
      }
      return false;
  }
}
