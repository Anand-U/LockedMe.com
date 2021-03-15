package LockedMe_Application;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFile {
	
	static String path = "/home/anandudell/eclipse-workspace/LockedMe.com/";

	public static void main(String[] args) {
		deletefile(path);
		
	}
	public static void deletefile(String path) {
		try {
			
			Files.delete(Paths.get(path));
			System.out.println("File is deleted successfully");
			
		} catch (Exception e) {
			System.out.println("File does not exist!");
		}
	}
}

		
			
		
	