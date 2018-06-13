package com.feng.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
//		logger.fatal("fatal msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("trace msg");
	}

}
