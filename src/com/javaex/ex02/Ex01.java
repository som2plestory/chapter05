package com.javaex.ex02;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {
	public static void main(String[] args) throws IOException{
		
		Writer fw = new FileWriter("C:\\javastudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("피니투라 페투치아 \n");
		bw.newLine();
		bw.write("니가 원하면 언제 어디서나 \n");
		bw.newLine();
		bw.write("날 만할 수 있어 \n");
		bw.newLine();
		bw.write("핑크핑크한 매력에 \n");
		bw.newLine();
		bw.write("녹아버릴걸 \n");
		bw.newLine();
		bw.write("Spotlight \n");
		
		
		bw.close();
	}

}
