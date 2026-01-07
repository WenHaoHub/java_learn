package com.msb.test;

import com.msb.mapper.BookMapper;
import com.msb.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        //指定核心配置文件的路径
        String resource = "mybatis.xml";
        //获取加载配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //加载配置文件 创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂类获取一个会话
        SqlSession SqlSession = sqlSessionFactory.openSession();
        //执行查询  老版本
//         List list= SqlSession.selectList("a.b.selectAllBooks");

        // 接口等于实现类
        BookMapper mapper = SqlSession.getMapper(BookMapper.class);
//        List list=mapper.selectAllBooks();
//        Book book=mapper.selectOneBook("vue架构");
        Book b = new Book();
        b.setAuthor("余华");
        b.setName("活着");
        Book book = mapper.selectOneBookObj(b);
        System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor());

//        for (int i = 0; i < list.size(); i++) {
//            Book b=(Book) list.get(i);
//            System.out.println(b.getId()+" 666"+b.getName()+" "+b.getAuthor());
//        }
        //关闭资源
        SqlSession.close();
    }
}
