package com.example.demo3.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo3.bean.Book;
import com.example.demo3.service.IBookService;
import com.example.demo3.controller.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService iBookService;
//    @GetMapping
//    public R queryAll()
//    {
//        return new R(true,iBookService.list());
//    }
    @GetMapping("/{id}")
    public R queryById(@PathVariable("id")Integer id){
        return new R(true,iBookService.getById(id));
    }


    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable("id") Integer id){
        return new R(iBookService.removeById(id));
    }
    @PostMapping
    public R save(@RequestBody Book book){
        boolean flag = iBookService.save(book);
        return new R(flag,flag?"添加成功^_^" : "添加失败-_-!");
    }

//    @GetMapping("/{currentPage}/{pageSize}")
//    public R queryAll(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Book> page = iBookService.getPage(currentPage, pageSize);
//        if(currentPage > page.getPages()){
//            page=iBookService.getPage((int)page.getPages(),pageSize);
//        }
//        return new R(true,page);
//    }
        @GetMapping("/{currentPage}/{pageSize}")
        public R queryAll(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
         IPage<Book> page = iBookService.getPage(currentPage, pageSize,book);
         if(currentPage > page.getPages()){
         page=iBookService.getPage((int)page.getPages(),pageSize,book);
    }
    return new R(true,page);
}
    @PutMapping
    public R dateById(@RequestBody Book book){
        return new R(true,iBookService.updateById(book));
    }

}
