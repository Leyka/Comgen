package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.*; 

public class FileHelper {	
	/**
	 * Returns a list of java files in a recursive way 
	 * @param folderPath folder to scan
	 * @return list of java files
	 * @throws FileNotFoundException 
	 */
	public static Collection<File> getAllJavaFiles(String folderPath) throws FileNotFoundException{
		// file exists?
		Path path = Paths.get(folderPath);
		if (Files.notExists(path, LinkOption.NOFOLLOW_LINKS)){
			throw new FileNotFoundException();
		}
		
		
		Collection<File> files = FileUtils.listFiles(
				new File(folderPath), 
				new RegexFileFilter(".*\\.(java)$"), 
				DirectoryFileFilter.DIRECTORY);
		
		return files; 
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
