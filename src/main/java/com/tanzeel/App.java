package com.tanzeel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.layout.PatternLayout;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final Logger logger = LogManager.getLogger();
        logger.trace("Entering method processOrder().");
        logger.debug("Received order with ID 12345.");
        logger.info("Order shipped successfully.");
        logger.warn("Potential security vulnerability detected in user input: '...'");
        logger.error("Failed to process order. Error: {. . .}");
        logger.fatal("System crashed. Shutting down...");

        System.out.println( "Hello World!" );
    }
}
