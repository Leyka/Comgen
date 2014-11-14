package app;

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
		
		String folderPath = ""; // Retrieve In console 
		
		Core c = new Core();
		int count = c.execute(folderPath);
		
		if (count > 0) {
			System.out.println("Succes! " + count + " files have been modified.");
		} else {
			System.out.println("0 file modified");
		}
		
	}

}
