package javaPackage;

import org.apache.logging.log4j.*;

public class Log4j2 {

	public static void main(String[] args) {
		
		
		Logger log = LogManager.getLogger("Log4j2");
		
		System.out.println("Hi Logger");
		log.error("hi error");
		log.fatal("hi fatal");
		

	}

}
