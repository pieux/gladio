package com.dianping.gladio.mapper;

import com.dianping.gladio.MyBatisConnectionFactory;
import com.dianping.gladio.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: pieux
 * Date: 13-5-30
 * Time: 下午1:19
 * To change this template use File | Settings | File Templates.
 */


public class UserMapper {

    private SqlSessionFactory sqlSessionFactory;

    public UserMapper() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }

    @SuppressWarnings("unchecked")
    public List<UserDao> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            List<UserDao> list = sqlSession.selectList("UserMapper.getAll");
            System.out.printf("selectAll() --> " + list);
            return list;
        } finally {
            sqlSession.close();
        }
    }

    public void insert(UserDao userDao) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            List<UserDao> list = sqlSession.selectList("UserMapper.insert");
            sqlSession.commit();
            System.out.printf("insert(" + userDao + ") --> " + userDao.getId());
        } finally {
            sqlSession.close();
        }
    }
}
