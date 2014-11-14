package helpers;

import java.io.File;
import java.util.ArrayList;

public class FileHelper {
	/**
	 * Returns true if file ends with .java
	 * @return true or false
	 */
	public static boolean isJavaFile(String fileName) {
		throw new UnsupportedOperationException();
		
		// regex
	}
	
	/**
	 * Returns a list of java files in a recursive way 
	 * @param folderPath folder to scan
	 * @return list of java files
	 */
	public static ArrayList<File> getAllJavaFiles(String folderPath){
		throw new UnsupportedOperationException();
		
		/**
		 * Get all files from folderpath
		 * Foreach files 
		 * 	Check if java file 
		 * 		add to list of java files 
		 * 
		 * return the list 
		 */
	}
	
	public static void modifyFile(File f, String content){
		// content -> String?
		
		/**
		 * Keep an old version of file 
		 * Write comments 
		 * Merge comments + old file 
		 * Save
		 */
	}
	
	/**
	 * Write and save a content into file
	 * @param f File
	 * @param content Content to add in header of file 
	 */
	public static void writeFile(File f){
		
	}
	
	/**
	 * Read content of file 
	 * @param f
	 */
	public static void readFile(File f){
		
	}
	
	
}
