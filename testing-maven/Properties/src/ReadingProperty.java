import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperty {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream  ip= new FileInputStream("C:\\Users\\hayro\\Desktop\\SELENIUM\\testing-maven\\Properties\\employee.properties");
  
		prop.load(ip);
		
		String name= prop.getProperty("name");
		System.out.println(name);
		System.out.println(prop.getProperty("age"));
	}

}
