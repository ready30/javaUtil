package javaUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BlogDoubleLineDelete {

	public static void main(String[] args) throws Exception {
		String result = "";		
		
		String fileName = "BlogDoubleLineSrcFile.txt";
		
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader is = new InputStreamReader(fis);		
        BufferedReader br = new BufferedReader(is);
        
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //int T = Integer.parseInt(br.readLine());
        
        String str = "";
        while((str = br.readLine()) != null) {
        	if (str.length() >0) {
        		System.out.println(str);
        	}
        	//System.out.println("[" + str.length() + "] "+ str);
        }
	}

}
