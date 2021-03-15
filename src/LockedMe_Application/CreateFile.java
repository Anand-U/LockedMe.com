package LockedMe_Application;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	static String path = "/home/anandudell/eclipse-workspace/LockedMe.com/";

	public static void main(String[] args) {
		// create an File
		createfile(path);;
		

	}
	public static void createfile(String filename) {
		
		File file=new File(filename);
		try {
			if(file.createNewFile()) {
			System.out.println("New File is created");
			}
			else {
				System.out.println("File already Exist");

				}
			
		} catch (IOException e) {
			
			System.out.println("File creation Failed");
		}
		
	}

}