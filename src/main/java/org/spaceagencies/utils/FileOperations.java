package org.spaceagencies.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileOperations {
	public static boolean isFileExists(String directory, String file) {
	    File fil = new File(directory + file);
	    if (fil.exists())
	    	return true;
	    return false;
	}
	
	public static boolean isDirectoryExists(String directory) {
	    File dir = new File(directory);
	    if (dir.exists())
	    	return true;
	    return false;
	}
	
	public static int fileReader(String file) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		int a = 0;
		String st;
		while ((st = br.readLine()) != null)
			a = Integer.parseInt(st);
		br.close(); 
		return a;
	}
}
