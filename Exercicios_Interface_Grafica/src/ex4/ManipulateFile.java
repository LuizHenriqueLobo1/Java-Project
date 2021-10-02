package ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulateFile {
	
	public String load(String path) {
		String string = "";
		try {
			FileReader file = new FileReader(path);
			BufferedReader readFile = new BufferedReader(file);
			string = readFile.readLine();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string;
	}
	
	public void save(String content, String path) {
		try {
            File file = new File(path);
            FileWriter fileWrite = new FileWriter(file);
            fileWrite.write(content);
            fileWrite.close();
        } catch (IOException ex) {
        	ex.getMessage();
        }
	}

}
