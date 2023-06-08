package de.iav;

import java.util.Objects;

public class Logger {

    private static Logger logger;

    private Logger() {}

    public static synchronized Logger getInstance(){
        if (logger == null){
            logger = new Logger();
        }
        return Objects.requireNonNull(logger);
    }

    public static synchronized void log(String message){
        System.out.println("Logger[" + getInstance().toString() + "]: " + message);
    }

}
