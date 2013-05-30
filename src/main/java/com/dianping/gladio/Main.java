/**
 * Created with IntelliJ IDEA.
 * User: pieux
 * Date: 13-5-29
 * Time: 下午4:16
 * To change this template use File | Settings | File Templates.
 */

package com.dianping.gladio;

import org.apache.log4j.Logger;

public class Main {
    public static void main(String args[]) {

        Logger logger = Logger.getLogger(Main.class);
        logger.debug("Beginning...");

        System.out.println("Hello, Gladiolus");

        logger.debug("...Ending");
    }

}
