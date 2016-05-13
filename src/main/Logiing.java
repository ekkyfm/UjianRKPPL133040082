package main;

import org.apache.log4j.Logger;

public class Logiing {
	
	private static Logger logger = Logger.getLogger(Logiing.class);
	
	public void getLogging(){
		logger.debug("ini adalah debug massage : Contoh Log4J");
		logger.info("ini adalah info massage : Contoh Log4J");
		logger.warn("ini adalah fatal massage : Contoh Log4J");
		logger.error("ini adalah warn massage : Contoh Log4J");
		logger.fatal("ini adalah error massage : Contoh Log4J");
	}
	
	public void setLoging(){
		
	}
	
	public static void main(String[] args) {
		Logiing l=new Logiing();
		l.getLogging();
	}

}
