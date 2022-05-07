package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) throws IOException{
		
		//읽기 스트림
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> dbList = new ArrayList<Person>();
		
		//text파일을 1줄씩 읽어서 리스트에 추가
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] phoneDB = str.split(",");
			
			String name = phoneDB[0];
			String hp = phoneDB[1];
			String company = phoneDB[2];
			
			Person p = new Person(name, hp, company);	//phoneDB[]로 안해도 됨
			dbList.add(p);
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
					
		}
		
		//System.out.println(dbList.toString());
		
		/////////////////////////////////////////////
		//추가할 데이터 생성
		
		// 객체 정보 생성 --> 이지희 010-1234-1234 031-123-1234
		Person p0 = new Person("이지희", "010-1234-1234", "02-123-1234");

		//리스트에 추가
		dbList.add(p0);
		
		//출력하기
		for(Person p : dbList) {
			System.out.println("이름: " + p.getName());
			System.out.println("핸드폰: " + p.getHp());
			System.out.println("회사: " + p.getCompany());
			System.out.println("");
		}
		
		
		//////////////////////////////////////////////////////
		//파일에 저장
		
		//쓰기 스트림
		Writer fw = new FileWriter("C:\\javaStudy\\file\\phoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person p : dbList) {
			String saveStr = p.getName() +"," + p.getHp() +"," +p.getCompany();
			System.out.println(saveStr);
			
			bw.write(saveStr);
			bw.newLine();
		}
		
		bw.close();
		br.close();
		
				
	}
	
}
