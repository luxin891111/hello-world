
package com.github.helloworld;

import org.apache.log4j.Logger;

public class HelloWorld {

    private static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        logger.info("Success!");

    }
}
