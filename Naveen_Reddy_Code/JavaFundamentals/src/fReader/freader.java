package fReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class freader {
	
	public static void rd(File f)throws Exception {
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line=br.readLine()) != null) {
			System.out.println(line);
			
			br.close();
			fr.close();
		}
	}
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\archuth\\Desktop\\fr.txt");
		try {
			rd(f);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Final Statement");
		}

    
	}
}
