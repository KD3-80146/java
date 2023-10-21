package com.sunbeam;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;


public class BufferStream {
	   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
       try(FileWriter fw=new FileWriter("ujj.txt")){
       try(BufferedWriter bw=new BufferedWriter(fw)){
    	   for(int i=0;i<4;i++)
    	   {
    	   System.out.println("Enter the line ");
    	   String str=sc.nextLine();
    	   bw.write(str);
    	   bw.newLine();
    	     
    	   }
    	   
       }
       
	}
       catch (Exception e) {
		e.printStackTrace();
	}

	}}
