package com.example.demo3.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo3.Dao.BookDao;
import com.example.demo3.bean.Book;
import com.example.demo3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book)>0;
    }

    @Override
    public Book queryById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> queryAll() {
        return bookDao.selectList(null);
    }

    @Override
    public Boolean deleteById(Integer id) {
        return bookDao.deleteById(id)>0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book)>0;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        return bookDao.selectPage(page,null);
    }
}
