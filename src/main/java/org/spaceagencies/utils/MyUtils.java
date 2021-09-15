package org.spaceagencies.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtils {
	public static String getPlanetName (String missionDescription) {
		Pattern pattern = Pattern.compile("(Mercury|Venus|Mars|Jupiter|Saturn|Uranus|Neptune)");
		Matcher matcher = pattern.matcher(missionDescription);
		String planetName = new String();
		if (matcher.find()) {
			planetName = matcher.group();
		} else {
			planetName = "";
		}
		return planetName;
	}
}