package learnPropertyFileConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class FetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties p= new Properties();
		FileInputStream fileInput = new FileInputStream("config2.properties");
		p.load(fileInput);
		
		System.out.println(p.getProperty("name"));
		ArrayList<Object> h = new ArrayList<>(p.keySet());
		for(Object s:h) {
			
			System.out.println(s.toString() + " "+ p.getProperty(s.toString()));
		}
		
		

	}

}
	

