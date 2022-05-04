package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) throws IOException{
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> dbList = new ArrayList<Person>();
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] phoneDB = str.split(",");
			
			String name = phoneDB[0];
			String hp = phoneDB[1];
			String company = phoneDB[2];
			
			Person p = new Person(phoneDB[0], phoneDB[1], phoneDB[2]);
			dbList.add(p);
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
					
		}
		
		br.close();
				
	}
	
}
