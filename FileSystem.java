// package com.fileopreations;
// import static com.fileopreations.CrudFiles.writeToFile;
// import static com.fileopreations.CrudFiles.readFromFile;
// import static com.fileopreations.CrudFiles.encryption;
// import static com.fileopreations.CrudFiles.decryption;
import java.io.File;

// import com.calender.ConsoleInput;

public class FileSystem {
	public static void main(String... main) {
		
		// File fileObj = new File("D:\\java\\fileopreations\\src\\com\\fileopreations\\newfile.txt");
		File fileObj = new File("D:\\FileEncryption-main\\FileEncryption-main\\newfile.txt");
		File fileObj2 = new File("D:\\FileEncryption-main\\FileEncryption-main\\newfile.enc");

		int choice ;
		String toWrite;
		String str;
		do {
			System.out.print("Enter choice\n"
					+"enter 1. to write to a file\n"
					+ "enter 2 to read from a file\n"
					+ "enter 3. to encrypt your file\n"
					+ "enter 4.to read form an ecrypted file\n\r");
			choice = ConsoleInput.getInt();
			switch(choice) {
			case 1:
				System.out.println("what you want to write :");
				toWrite = ConsoleInput.getString();
				CrudFiles.writeToFile(fileObj,toWrite);
				break;
			case 2:
				str = CrudFiles.readFromFile(fileObj);
				System.out.println(str);
				break;
			case 3:
				// System.out.println("what you want to write :");
				toWrite = CrudFiles.readFromFile(fileObj);
				fileObj.delete();
				CrudFiles.writeToFile(fileObj2,toWrite,true); //overloaded method for encrypted file
				
				break;
			case 4:
				str = CrudFiles.readFromFile(fileObj2,true);
				CrudFiles.writeToFile(fileObj,str);
				System.out.println(str);
				break;
			
			case 5:
				System.out.print("bye bye");				
				break;
			}
			
			
		}while(choice != 5);
	}
	
	
	
}




