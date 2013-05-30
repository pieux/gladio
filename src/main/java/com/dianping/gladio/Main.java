/**
 * Created with IntelliJ IDEA.
 * User: pieux
 * Date: 13-5-29
 * Time: 下午4:16
 * To change this template use File | Settings | File Templates.
 */

package com.dianping.gladio;

import com.dianping.gladio.dao.UserDao;
import com.dianping.gladio.mapper.UserMapper;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {
    public static void main(String args[]) {

        Logger logger = Logger.getLogger(Main.class);
        logger.debug("Beginning...");

        System.out.println("Hello, Gladiolus");

        UserMapper userMapper = new UserMapper();
        UserDao userDao = new UserDao();
        userDao.setName("Pieux Xi");

        List<UserDao> userDaos = userMapper.selectAll();

        logger.debug("...Ending");
    }

}
