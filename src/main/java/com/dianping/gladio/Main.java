/**
 * Created with IntelliJ IDEA.
 * User: pieux
 * Date: 13-5-29
 * Time: 下午4:16
 * To change this template use File | Settings | File Templates.
 */

package com.dianping.gladio;

import com.dianping.gladio.dao.UserDao;
import com.dianping.gladio.domain.ClientService;
import com.dianping.gladio.domain.DomainModule;
import com.dianping.gladio.domain.Service;
import com.dianping.gladio.mapper.UserMapper;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class Main {

//    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String args[]) {

//        logger.debug("Beginning...");

        System.out.println("Hello, Gladiolus");

        Injector injector = Guice.createInjector(new DomainModule());
        ClientService clientService = injector.getInstance(ClientService.class);
        clientService.go();

//        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        int newId = -1;
//        try {
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            UserDao newUserDao = new UserDao();
//            newUserDao.setName("Xi 33");
//            userMapper.insert(newUserDao);
//            sqlSession.commit();
//            newId = newUserDao.getId();
//        } finally {
//            sqlSession.close();
//        }

//        UserMapper userMapper = new UserMapper(MyBatisConnectionFactory.getSqlSessionFactory());
//        UserDao newUserDao = new UserDao();
//        newUserDao.setName("Xi 33");
//        userMapper.insert(newUserDao);
//
//        List<UserDao> userDaos = userMapper.getAll();
//
//        for (int i = 0; i < userDaos.size(); i++)
//        {
//            userMapper.deleteById(userDaos.get(i).getId());
//        }
//
//        List<UserDao> refreshUserDaos = userMapper.getAll();

//        logger.debug("...Ending");
    }

}

