package com.msb.test;

import com.msb.mapper.BookMapper;
import com.msb.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestInsert {
    public static void main(String[] args) throws IOException {

        //指定核心配置文件的路径
        String resource = "mybatis.xml";
        //获取加载配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //加载配置文件 创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂类获取一个会话
        SqlSession SqlSession = sqlSessionFactory.openSession();
        // 接口等于实现类
        BookMapper mapper = SqlSession.getMapper(BookMapper.class);
        com.msb.pojo.Book b = new com.msb.pojo.Book();
        b.setAuthor("张");
        b.setId(3);
        b.setPrice(68.9);
        b.setName("父辈的荣耀");
        int result = mapper.insertBook(b);
        System.out.println(result);
        //事务相关的操作
        SqlSession.commit();
        //关闭资源
        SqlSession.close();
    }
}
