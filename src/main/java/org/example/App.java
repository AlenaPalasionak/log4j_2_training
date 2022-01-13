package org.example;
import org.apache.logging.log4j.LogManager;//будут гореть красным - добавить апач через мавен
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        // let's pretend we're logging!
        System.out.println( "Hello World!" );
        // let's pretend we're logging again!
        LOGGER.trace("We've just greeted the user!");
        LOGGER.debug("We've just greeted the user!");
        LOGGER.info("We've just greeted the user!");
        LOGGER.warn("We've just greeted the user!");
        LOGGER.error("We've just greeted the user!");
        LOGGER.fatal("We've just greeted the user!");
    }
}
