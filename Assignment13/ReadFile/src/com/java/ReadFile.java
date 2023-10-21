package com.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) {
		
		try(FileReader f1=new FileReader("/home/sunbeam/Desktop/git_data/java/Assignment13/BufferStream/ujj.txt")){
			try(BufferedReader f2 =new BufferedReader(f1))
			{
				boolean line;
				while(line=f2.readLine()!=null)
				{
					System.out.println(line);
				}
				
			}
		}
		
         catch (Exception e) {
			e.printStackTrace();
		}
	}

}
