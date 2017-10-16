package com.essilor;

/*import java.util.logging.Level;
import java.util.logging.Logger;*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logslf4J {
    // private static Logger LOGGER= Logger.getLogger(LoggingTestLog4J.class.getName());
    private static Logger LOGGER = LoggerFactory.getLogger(Logslf4J.class);

    public static void main(String[] args) {
        //  LOGGER.setLevel(Level.INFO);
        LOGGER.info("Hello in Logger");
        // LOGGER.severe("Hello level is severe");

        System.out.println("hai");


    }
}
