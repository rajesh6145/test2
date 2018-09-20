package learnPropertyFileConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileOutputStream fileOut= new FileOutputStream("config.properties");
		p.setProperty("name", "rajesh");
		p.setProperty("surname", "verma");
		p.setProperty("city", "sirsa");
		p.setProperty("status", "married");
		p.setProperty("company", "Adobe-temp");
		
		p.store(fileOut, "am creating this properties file just to learn it" );
		System.out.println("properties file has been created successfully. please check it once at your own level");
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("surname"));
		System.out.println(p.getProperty("city"));
		System.out.println(p.getProperty("status"));
		
		
		

	}

}
