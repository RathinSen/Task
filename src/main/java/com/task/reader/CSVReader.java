package com.task.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.task.dao.Dao;

public class CSVReader {

	public static void main(String[] args)
	{
		String s = "/Users/Thync/Downloads/INTERFACES_TASK_INPUT.csv";
		Dao dao = new Dao();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		try {
			br = new BufferedReader(new FileReader(s));
			int i = 0;
			while((line=br.readLine())!=null)
			{
				if(i>0)
				{
				String[] sentence = line.split(cvsSplitBy);
				//System.out.println(sentence[0]+ "*"+sentence[1]+"**"+sentence[2]);
				dao.dbput(sentence);
				}
				i++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
