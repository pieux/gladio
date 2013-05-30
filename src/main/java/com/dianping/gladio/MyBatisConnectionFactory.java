/**
 * Created with IntelliJ IDEA.
 * User: pieux
 * Date: 13-5-30
 * Time: 下午1:00
 * To change this template use File | Settings | File Templates.
 */

package com.dianping.gladio;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyBatisConnectionFactory {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            if (sqlSessionFactory == null)
            {
                sqlSessionFactory =
                        new SqlSessionFactoryBuilder().build(inputStream);
            }
        } catch (FileNotFoundException fnfEx) {
            fnfEx.printStackTrace();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
