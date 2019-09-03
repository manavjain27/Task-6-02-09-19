package com.wo.IO;
import java.io.*;
import java.util.*;
public class CitiesAdd {

	public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		
		String cities[]=new String[5];
		
		System.out.println("Enter Cities Names");
		
		for(int i=0;i<5;i++)
		{
			cities[i]=sc.next();
		}

		
		File f=new File("f:/javatask/cities.txt");
		
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		FileWriter fw=new FileWriter(f,true);
		for(int i=0;i<cities.length;i++)
			fw.write(cities[i]+", ");
		
		System.out.println("File Created Successfully");
		
		fw.close();
		sc.close();
	}

}
