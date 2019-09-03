package com.wo.IO;
import java.util.*;
import java.io.*;
public class FileRead {

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name");
		String fname1=sc.next();
		fname1="F:/javatask/"+fname1+".txt";
		
		try {
		File f=new File(fname1);
		
		if(!f.exists())
			System.out.println("File does not exists");
		else
		{
			FileInputStream fis=new FileInputStream(f);
			byte b[]=new byte[fis.available()];
			
			while(fis.available()>0)
			{
				fis.read(b);
				
			}
			
			String read=new String(b);
			System.out.println(read);
			
			fis.close();
			
			if(f.delete())
				System.out.println("File Deleted");
			
			
			sc.close();
			
		}
	}
		catch(Exception e)
		{
			System.out.println("Exception raised");
		}
		
			
			
			
			
		}
		

	}

