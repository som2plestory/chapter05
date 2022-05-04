package com.javaex.ex02;

import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ex02 {
	public static void main(String[] args) throws IOException{
		
		Reader fr = new FileReader("C:\\javaStude\\file\\MS949txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();	//한줄씩 읽어온다 - 줄바꿈기호는 제외
			
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		
		br.close();
		
	}

}
