package com.wo.IO;
import java.io.*;
import java.util.*;
public class MergeFiles {

	public static void main(String[] args) throws Exception {

			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter Folder Name");
			
			String folderName=sc.next();
			folderName="F:/"+ folderName;
			
			System.out.println("\nEnter Target file");
			String fileName=sc.next();
			fileName="F:/javatask/Final.txt";
			
			File f=new File(folderName);
			
			if(f.isDirectory())
			{
				File files[] = f.listFiles();
				Arrays.sort(files);
				StringBuffer sb=new StringBuffer();
				
				for(File file:files)
				{
					FileInputStream fis=new FileInputStream(file);
					byte b[]=new byte[fis.available()];
					while(fis.available()>0)
					{
						fis.read(b);
						
					}
					
					sb.append(new StringBuffer(new String(b)));
					fis.close();
				}
				
				FileOutputStream fos=new FileOutputStream(fileName);
				fos.write(sb.toString().getBytes());
				System.out.println("File Merged Successfully");
				
				fos.close();
				}
			else
				System.out.println("Given folder is not a directory");
			
			sc.close();
				
			}
	
	}

