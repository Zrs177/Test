package com.example.demo3;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo3.Dao.BookDao;
import com.example.demo3.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3ApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
//        System.out.println(bookDao.selectById(5));
//        IPage page=new Page(2,5);
//        bookDao.selectPage(page,null);
//        System.out.println(page.getTotal());
//        System.out.println(page.getPages());
//        System.out.println(page.getRecords());
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("name","C");
        System.out.println(bookDao.selectList(qw));
    }

}
