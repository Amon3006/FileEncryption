package com.fileopreations;
import static com.fileopreations.CrudFiles.writeToFile;
import static com.fileopreations.CrudFiles.readFromFile;
import static com.fileopreations.CrudFiles.encryption;
import static com.fileopreations.CrudFiles.decryption;
import java.io.File;

import com.calender.ConsoleInput;

public class FileSystem {
	public static void main(String... main) {
		
		File fileObj = new File("D:\\java\\fileopreations\\src\\com\\fileopreations\\newfile.txt");
		int choice ;
		String toWrite;
		String str;
		do {
			System.out.print("Enter choice\n"
					+"enter 1. to write to a file\n"
					+ "enter 2 to read from a file\n"
					+ "enter 3. to write with encryption\n"
					+ "enter 4.to read form an ecrypted file\n\r");
			choice = ConsoleInput.getInt();
			switch(choice) {
			case 1:
				System.out.println("what you want to write :");
				toWrite = ConsoleInput.getString();
				writeToFile(fileObj,toWrite);
				break;
			case 2:
				str = readFromFile(fileObj);
				System.out.println(str);
				break;
			case 3:
				System.out.println("what you want to write :");
				toWrite = ConsoleInput.getString();
				writeToFile(fileObj,toWrite,true); //overloaded method for encrypted file
				
				break;
			case 4:
				str = readFromFile(fileObj,true);
				System.out.println(str);
				break;
			}
			
			
		}while(choice != 4);
	}
	
	
	
}
