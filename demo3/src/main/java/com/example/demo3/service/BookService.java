package com.example.demo3.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo3.bean.Book;

import java.util.List;

public interface BookService {
     Boolean save(Book book);
     Book queryById(Integer id);
     List<Book> queryAll();
     Boolean deleteById(Integer id);
     Boolean update(Book book);
     IPage<Book> getPage(int currentPage,int pageSize);
}
