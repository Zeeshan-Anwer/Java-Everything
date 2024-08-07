package com.wissen.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {
public static void main(String[] args)
			throws IOException
	{
		File file = new File("C:\\Users\\hp\\Desktop\\sampletext.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
		String line;
		int wordCount = 0;
		int chCount = 0;
		int paraCount = 0;
		int space = 0;
		int sentenceCount = 0; 
		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("")) {
				paraCount += 1;
			}
			else {
				chCount += line.length();
				String words[] = line.split("\\s+");
				wordCount += words.length;
				space += wordCount - 1;
				String sentence[] = line.split("[!?.:]+");
				sentenceCount += sentence.length;
			}
		}
		if (sentenceCount >= 1) {
			paraCount++;
		}
		System.out.println("Total word count = "+ wordCount);
		System.out.println("Total number of sentences = "+ sentenceCount);
		System.out.println("Total number of characters = "+ chCount);
		System.out.println("Number of paragraphs = "+ paraCount);
		System.out.println("Total number of whitespaces = "+ space);
	}
}
