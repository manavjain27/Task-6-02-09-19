package com.wo.IO;
import java.util.*;
import java.io.*;

public class FileRename {

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first file");
		String fname1=sc.next();
		fname1="F:/javatask/"+fname1+".txt";
		System.out.println("Enter Second file");
		String fname2=sc.next();
		fname2="F:/javatask/"+fname2+".txt";
		
		File f1=new File(fname1);
		File f2=new File(fname2);
		
		if(f1.exists())
		{
			if(f1.isFile())
			{
				if(!f2.exists())
				{
					
						if(f1.length()<500)
						{
							f1.renameTo(f2);
							System.out.println("File Renamed");
						}
						else
						{
							System.out.println("File Size is above 500 bytes");
						}
					}
					

				else
				{
					System.out.println("Second file already exists");
				}
			}
			else
			{
				System.out.println("Not a file");
			}
		}
		
		else
		{
			System.out.println("File does not exists");
		}
		
		sc.close();

	}

}
