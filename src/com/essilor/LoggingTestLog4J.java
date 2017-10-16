package com.essilor;

import java.util.logging.Level;
import java.util.logging.Logger;



public class LoggingTestLog4J {
   // private static Logger LOGGER= Logger.getLogger(LoggingTestLog4J.class.getName());
   private static Logger LOGGER = Logger.getLogger(LoggingTestLog4J.class.getName());
    public static void main(String[] args) {
      //  LOGGER.setLevel(Level.INFO);
        LOGGER.info("Hello in Logger");
       // LOGGER.severe("Hello level is severe");

    }
}
