package LockedMe_Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchFile {
	
	
	static String path = "/home/anandudell/eclipse-workspace/LockedMe.com/";
	
	//Path path = Paths.get("/home/anandudell/eclipse-workspace/LockedMe.com/");

	public static void main(String[] args) {
		searcfile(path);

	}
	public static void  searcfile(String Searchfile) {
		File f=new File(Searchfile);
		if(f.exists())
		 {
			System.out.println("File Exist");
			
		}
		 else
	 {
			 System.out.println("File doesn't Exist");
		 }
	}
	
}

