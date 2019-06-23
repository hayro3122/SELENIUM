package package1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {

	public static void main(String[] args) {
		Logger log= LogManager.getLogger(LogTest.class.getName());
		
		log.debug("I am logging ");// when each selenium action is performed like click(),
		//sendKeys, getText();
		log.info("Object is present");// When operation successfuly completed.
		//exp. After loading page 
		log.debug("Starting");
		
		if(20>2) {
			log.info("object is present");
		}else {
			log.error("object is not present");
		}
	
	}
}
