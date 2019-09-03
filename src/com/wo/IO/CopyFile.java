package com.wo.IO;
import java.io.*;
import java.util.*;
public class CopyFile {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first file to copy contents");
		String fname1=sc.next();
		fname1="F:/javatask/"+fname1+".txt";
		
		System.out.println("Enter second file to copy contents from first file");
		String fname2=sc.next();
		fname2="F:/javatask/"+fname2+".txt";
		
		File f1=new File(fname1);
		File f2=new File(fname2);
		
		if(!f1.exists())
		{
			System.out.println("File does not exist");
			
		}
		
		else
		{
			if(!f2.exists())
			{
				System.out.println("File does not exist");
				
			}
			else
			{
		
		FileInputStream fis=new FileInputStream(fname1);
		byte b[]=new byte[fis.available()];
		
		while(fis.available()>0)
		{
			fis.read(b);
			
		}
		
		String str=new String(b);
		
		FileWriter fw=new FileWriter(fname2);
		fw.write(str);
		
		System.out.println("File Copied Successfuly");
		
		fw.close();
		fis.close();
		sc.close();
		}
		}
	}

}
