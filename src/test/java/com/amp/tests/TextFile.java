package com.amp.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class TextFile 
{
	File fil=new File("D:\\Broswer Binidings\\browserbindingshelp.txt");
	
	@Test(priority=0)
	public void createTextFile() throws IOException
	{
		
		fil.createNewFile();
		
		FileWriter Fw=new FileWriter(fil);
		BufferedWriter Bw=new BufferedWriter(Fw);
		Bw.write("this is all about the browser bindings folder and its very secret...");
		Bw.newLine();
		Bw.write("When i mean its secret dont try to explore...!!!!!!!!!!!");
		Bw.close();
		
	}
	
	@Test(priority=1)
	public void readTextFile() throws Exception
	{
		FileReader Fr=new FileReader(fil);
		BufferedReader Br=new BufferedReader(Fr);
		
//		while(Br.readLine()!=null)
//		{
//			System.out.println(Br.readLine());
//		}
		
		String Content = Br.readLine();
		  
		  //Loop to read all lines one by one from file and print It.
//		  while((Content = Br.readLine())!= null)
//		  {
//		   System.out.println(Content);
//		  }
			
		  while(Content!= null)
		  {
		   System.out.println(Content);
		   Content = Br.readLine();
		  }
		

}
}
