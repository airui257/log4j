package com.feng.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Main.class);
		logger.fatal("log4j2 ---> fatal msg");
		logger.error("log4j2 ---> error msg");
		logger.warn("log4j2 ---> warn msg");
		logger.info("log4j2 ---> info msg");
		logger.debug("log4j2 ---> debug msg");
		logger.trace("log4j2 ---> trace msg");
	}

}
