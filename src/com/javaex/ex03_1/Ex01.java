package com.javaex.ex03_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "PhoneDB");
		BufferedReader br = new BufferedReader(isr);
		
		List dbList = new ArrayList();
		
		while(true) {
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			
			String[] strArr = str.split(",");
			String name = strArr[0];
			String hp = strArr[1]; 
			String company = strArr[2];
			
			dbList.add(name, hp, company);
			
			System.out.println("이름: "+ name);
			System.out.println("핸드폰: "+ hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
		}
		
		dbList.add(dbList);
		
		
		br.close();
		
		
	}

}
