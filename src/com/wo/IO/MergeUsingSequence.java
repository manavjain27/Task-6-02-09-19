package com.wo.IO;
import java.util.*;
import java.io.*;

public class MergeUsingSequence {

	public static void main(String[] args) throws Exception {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first file");
		String fname1=sc.next();
		fname1="F:/javatask/"+fname1+".txt";
		System.out.println("Enter Second file");
		String fname2=sc.next();
		fname2="F:/javatask/"+fname2+".txt";
		System.out.println("Enter Final file");
		String fname3=sc.next();
		fname3="F:/javatask/"+fname3+".txt";
		
		
		File f1=new File(fname1);
		File f2=new File(fname2);
		File f3=new File(fname3);
		
		FileInputStream fis1=new FileInputStream(f1);
		FileInputStream fis2=new FileInputStream(f2);
		
		if(f1.exists() && f2.exists())
		{
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			
			FileOutputStream fostream = new FileOutputStream(f3);        // destination file
			 
		    int temp;
		    while( ( temp = sis.read() ) != -1)
		    {
		      fostream.write(temp);	// to write to file
		    }
		    
		    System.out.println("File Mereged and saved to "+fname3);
		    sis.close();
		    fostream.close();
		}
		else
		{
			System.out.println("File does not exist");
			
		}
		
		fis1.close();
		fis2.close();
		
		
		sc.close();
		
		
		

	}

}
