package com.wp.emp;
import java.util.*;

import java.io.*;

public class DisplayEmp {

	public static void main(String[] args) throws Exception {
		
			Scanner sc=new Scanner(System.in);
		
			System.out.println("To Add Employee-Press 1");
			System.out.println(" For De-Serialization - Press 2");
			
			Employees e;
			int check=sc.nextInt();
			if(check==1)
			{
				
				System.out.println("Enter Employee No: ");
				int eNum=sc.nextInt();
				
				System.out.println("Enter Employee Name: ");
				String eName=sc.next();
				
				System.out.println("Enter Employee Salary: ");
				int eSal=sc.nextInt();
				
				
				e=new Employees(eNum,eName,eSal);
				
				File f=new File("F:/javatask/Employee.txt");
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(e);
				
				fos.close();
				oos.close();
				
				System.out.println("Employee Details Saved");
			}
			else if(check==2)
			{
				
				File f=new File("F:/javatask/Employee.txt");
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				e = (Employees) ois.readObject();
				
				System.out.println("Employee No "+e.eno);
				System.out.println("Employee Name "+e.ename);
				System.out.println("Employe Salary "+e.esal);
				
				fis.close();
				ois.close();
			}
			
			else
				System.exit(0);
			
			sc.close();
		
	}

}
