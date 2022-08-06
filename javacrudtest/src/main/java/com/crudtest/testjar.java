package com.crudtest;

import java.util.Scanner;

import com.task2.*;

public class testjar {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employees?useSSL=false";
		String user = "root";
		String password = "password";
		Deletedata d = new Deletedata();
		Insertdata i = new Insertdata();
		Updatedata u = new Updatedata();
		Getalldata g = new Getalldata();
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine();
		Integer input = Integer.parseInt(inp);
		if(input ==1)d.delete(url, user, password);
		if(input ==2)i.insert(url, user, password);
		if(input ==3)u.update(url, user, password);
		if(input ==4)g.getdata(url,user,password);
	}

}
