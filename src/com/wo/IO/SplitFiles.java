package com.wo.IO;
import java.io.*;
import java.util.*;
public class SplitFiles {

	public static void main(String[] args) throws Exception {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter File Name: ");
		String fname=sc.next();
		String filename="F:/javatask/"+fname+".txt";
		
		System.out.println("\nEnter Split Number: ");
		int n=sc.nextInt();
		
		File f=new File(filename);
		
		if(f.exists())
		{
			FileInputStream fis=new FileInputStream(f);
			byte b[]=new byte[fis.available()];
			while(fis.available()>0)
			{
				fis.read(b);
				
			}
			fis.close();
			String res=new String(b);
			
			ArrayList<String> list=new ArrayList<>();
			int split=res.length()/n;
			int start=0;
			int end=split;
			
			for(int i=0;i<n-1;i++)
			{
				list.add(res.substring(start,end));
				start=end;
				end+=split;
			}
			
			String last=res.substring(start,res.length());
			list.add(last);
			
			File folder=new File("f:/javatask/splitFil");
			if(!folder.exists())
			folder.mkdir();
			
			
				for(int i=1;i<=n;i++)
				{
					String file="f:/javatask/splitFil/"+fname+i+".txt";
					System.out.println(file);
					FileOutputStream fos=new FileOutputStream(file);
					fos.write(list.get(i-1).getBytes());
					fos.close();
					
					
				}
				System.out.println("File splitted");
			
			}
			
			
			
			else
			{
				System.out.println("File does not exists");
			}
		
		sc.close();
		
		}
		
		
		
	
		

	}


