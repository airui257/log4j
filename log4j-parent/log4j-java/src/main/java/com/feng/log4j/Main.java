package com.feng.log4j;

import org.apache.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Main.class);
		logger.fatal("fatal msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("trace msg");
	}

}
