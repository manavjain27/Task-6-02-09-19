package com.wp.emp;

import java.io.Serializable;

public class Employees implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public int eno;
	public String ename;
	public int esal;
	
	
	public Employees(int eno, String ename, int esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	
	

}
