package LockedMe_Application;

import java.util.Scanner;

public class LockmeApp {

	public static void main(String[] args) {
		// Display Welcome Screen

		try {

			System.out.println("--------------*Welcome to LockMe Application*-------------");
			System.out.println("Developer: Anand_U");
			System.out.println("Please select any of the below Options \n 1. Add a File  " + "2.Delete a File" +  " 3. Search a File");
			Scanner inputs=new Scanner(System.in);
			int Userinput =inputs.nextInt();
			if(Userinput<=3){
				System.out.println("User Selected option is :: " +Userinput);

			}
			else
			{
				System.out.println("User selected an invalid option");
			}	

			CreateFile createfl=new CreateFile();
			DeleteFile deletefl=new DeleteFile();
			SearchFile sfile=new SearchFile();
			if(Userinput==1) {
				System.out.println("Enter the File name to be added::");
				Scanner Filetoadd=new Scanner(System.in);
				String Addfile=Filetoadd.next();
				createfl.createfile(Addfile);
			}
			else if (Userinput==2){
				System.out.println("Enter the file name to be deleted::");
				Scanner Filetodelete=new Scanner(System.in);
				String Delfile =Filetodelete.next();
				deletefl.deletefile(Delfile);

			}
			else if(Userinput==3)
				System.out.println("Enter Filename to search for::");
			Scanner Filetosearch=new Scanner(System.in);
			String Searchfile =Filetosearch.next();
			sfile.searcfile(Searchfile);


		} catch (Exception e) {
			System.out.println("User Entered Invalid option::");
			System.exit(1);
		}


	}

	private static String DeleteFile() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String CreateFile() {
		// TODO Auto-generated method stub
		return null;
	}

}
