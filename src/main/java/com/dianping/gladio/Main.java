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

import java.util.List;

public class Main {

//    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String args[]) {

//        logger.debug("Beginning...");

        System.out.println("Hello, Gladiolus");

        UserMapper userMapper = new UserMapper(MyBatisConnectionFactory.getSqlSessionFactory());
        UserDao newUserDao = new UserDao();
        newUserDao.setName("Xi 33");
        userMapper.insert(newUserDao);

        List<UserDao> userDaos = userMapper.getAll();

        for (int i = 0; i < userDaos.size(); i++)
        {
            userMapper.delete(userDaos.get(i).getId());
        }

        List<UserDao> refreshUserDaos = userMapper.getAll();

//        logger.debug("...Ending");
    }

}
