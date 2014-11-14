package helpers;

import java.util.Scanner;

public class ConsoleHelper {

	public static String askFolderPath(Scanner s){
		System.out.println("Enter Folder path:");
		String folderPath = s.nextLine();        
		return folderPath;
	}
}
