package com.dianping.gladio.mapper;

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

    private SqlSessionFactory sqlSessionFactory = null;

    public UserMapper(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<UserDao> getAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            List<UserDao> list = sqlSession.selectList("UserDao.getAll");
            System.out.println("getAll() --> " + list);
            return list;
        } finally {
            sqlSession.close();
        }
    }

    public UserDao getById(int id) {
        UserDao result = null;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            result = sqlSession.selectOne("UserDao.getById", id);
            System.out.println("getById(" + id + ") --> " + result);
            return result;
        } finally {
            sqlSession.close();
        }
    }

    public void insert(UserDao userDao) {
        int id = -1;
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            id = sqlSession.insert("UserDao.insert", userDao);
            sqlSession.commit();
            System.out.println("insert(" + userDao + ") --> " + userDao.getId());
        } finally {
            sqlSession.close();
        }
    }

    public void update(UserDao userDao) {
        int id = -1;
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            id = sqlSession.update("UserDao.update", userDao);
            sqlSession.commit();
            System.out.println("update(" + userDao + ") --> updated");
        } finally {
            sqlSession.close();
        }
    }

    public void deleteById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            sqlSession.delete("UserDao.deleteById", id);
            sqlSession.commit();
            System.out.println("deleteById(" + id + ") --> deleted");
        } finally {
            sqlSession.close();
        }
    }

}
