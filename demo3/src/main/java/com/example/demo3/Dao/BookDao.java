package com.example.demo3.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo3.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
