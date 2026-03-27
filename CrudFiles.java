package com.fileopreations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CrudFiles {
	
	
	public static String  encryption(String str) {
		int len = str.length();
		
		StringBuffer stbf = new StringBuffer();
		for(int i = 0; i<len;i++)
		{
			stbf.append((char)(str.charAt(i)+10));
		}
		str = stbf.toString();
		
		//System.out.println(str);
		
		
		return str;
	}
	
	
	public static String  decryption(String str) {
		int len = str.length();
		
		StringBuffer stbf = new StringBuffer();
		for(int i = 0; i<len;i++)
		{
			stbf.append((char)(str.charAt(i)-10));
		}
		str = stbf.toString();
		
		System.out.println(str);
		
		
		return str;
	}
	
	
	public static String readFromFile(File ins) {
		
		int size = (int)ins.length();
		
		
		try (FileInputStream in = new FileInputStream(
				ins.getAbsolutePath());
				) 
		
		{   
//			byte[] bytes = "hello world".getBytes();
			byte[] bytes = new byte[size];
			in.read(bytes);
			return new String(bytes);
		} 
		catch (IOException e ) 
		{
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
			return null;
		
	}

	
	
	
public static String readFromFile(File ins,boolean decrypt) {

		int size = (int)ins.length();
		String s ;
		
		try (FileInputStream in = new FileInputStream(
				ins.getAbsolutePath());
				) 
		
		{   
//			byte[] bytes = "hello world".getBytes();
			byte[] bytes = new byte[size];
			in.read(bytes);
			s =new String(bytes);
			if(decrypt)
				s = decryption(s);
			return s;
		} 
		catch (IOException e ) 
		{
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
			return null;
		
	}
	
	
public static void writeToFile(File ins,String toWrite) {
		
		
		
		try (FileOutputStream in = new FileOutputStream(
				ins.getAbsolutePath());
				) 
		
		{   
			byte[] bytes = toWrite.getBytes();
			in.write(bytes);
		} 
		catch (IOException e ) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


public static void writeToFile(File ins,String toWrite,boolean encrypt) {
	
	if(encrypt)
	toWrite = encryption(toWrite);
	
	try (FileOutputStream in = new FileOutputStream(
			ins.getAbsolutePath());
			) 
	
	{   
		byte[] bytes = toWrite.getBytes();
		in.write(bytes);
	} 
	catch (IOException e ) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	
	

}
