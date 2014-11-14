package app;

import helpers.ConsoleHelper;
import helpers.FileHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

/**
 * A small tool to useful commentary in header of each java files.
 * I'm using it in school project to generate a static comment (like my name)
 * 
 * Algorithm : 
 * 
 * Personalize the comment to add some variable (keep in textdoc and modify some parameters?) 
 * Pass a folder path to read java files (regex)
 * For each file 
 * 	Read each java files in this doc path
 * 		Keep in memory content
 *  	Add before content the comments
 * Show message of success and how much files have been modified 
 */
public class Main {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        String folderPath = ConsoleHelper.askFolderPath(scanner);

		Core c = new Core();
		int count = 0;
		
		try {
			count = c.execute(folderPath);
		} catch (FileNotFoundException e) {
			System.out.println("Oups, directory not found. Try again...");
			// Try again
		}
		
		if (count > 0) {
			System.out.println("Succes! " + count + " files have been modified.");
		} else {
			System.out.println("0 file modified");
		}
		
	}

}
