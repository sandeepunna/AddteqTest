package com.example.AddteqTest;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import Modal.UserNames;

public class ReadUsersFromFile {

	private String  fileName;
	
	public void setFileName(String fileName) {
		this.fileName=fileName;
	}
	public String getFileName()
	{
		return fileName;
	}
	public List<UserNames> getAllUsers()
	{
		List<UserNames> list=new ArrayList<UserNames>();
		try
		{
			
			
			System.out.println("File name:"+fileName);
	        ClassLoader classLoader = new ReadUsersFromFile().getClass().getClassLoader();
	        File file = new File(classLoader.getResource(fileName).getFile());
	        System.out.println("File Found : " + file.exists());
	        

			   
			DataInputStream din=new DataInputStream(new FileInputStream(file));
			String str=null;
			while((str=din.readLine())!=null)
			{
				
				if(str.trim().length()>0)
				{
					System.out.println(str);
					String data[]=str.split(",");
					list.add(new UserNames(data[0], data[1]));
					
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error in file operation:"+ex);
		}
		return(list);
	}
}