package app;

import helpers.FileHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

public class Core {
	
	private final String FILE_PATH_COMMENTS = "../doc/header_comment.txt"; 
	
	/**
	 * Execute the operation of adding comment in the top of all java files.
	 * @param folderPath The path of the java project (src) 
	 * @return Count of modified java files
	 * @throws FileNotFoundException 
	 */
	public int execute(String folderPath) throws FileNotFoundException {
		int modified_file_counter = 0; 
		
		//File comment = new File(FILE_PATH_COMMENTS); 
		
		Collection<File> javaFiles = FileHelper.getAllJavaFiles(folderPath);
		
		for(File file : javaFiles){
			//FileHelper.modifyFile(file, content);
			modified_file_counter++;
		}
		
		return modified_file_counter;
	}
	
}
