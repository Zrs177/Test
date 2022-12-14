package com.example.demo3.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo3.bean.Book;

public interface IBookService extends IService<Book> {
     IPage<Book> getPage(int currentPage,int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
