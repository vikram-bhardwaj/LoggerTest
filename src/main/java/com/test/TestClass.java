package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestClass
{
	private static Logger logger = LogManager.getLogger(TestClass.class.getName());
	public static void main(String[] args)
	{
		logger.info("This is from TestClass");
	}
}
