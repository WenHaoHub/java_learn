package com.msb.test;

import com.msb.pojo.Book;
import com.msb.pojo.Boy;
import com.msb.pojo.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
//        Girl g=new Girl();
//        g.setAge(26);
//        g.setName("heluhan");
//        Boy b=new Boy();
//        b.setName("xiaoming");
//        b.setAge(28);
//        g.setBoyfriend(b);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Girl g= (Girl)context.getBean("girl");
        System.out.println("girl name:"+g.getName()+",age:"+g.getAge());
        System.out.println("boyfriend name:"+g.getBoyfriend().getName()+",age:"+g.getBoyfriend().getAge());

    }
}
