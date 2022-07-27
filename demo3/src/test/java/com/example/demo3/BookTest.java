package com.example.demo3;

import com.example.demo3.bean.Book;
import com.example.demo3.service.BookService;
import com.example.demo3.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BookTest {
    @Autowired
    private IBookService iBookService;
    @Test
    public void test01(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder= MockMvcRequestBuilders.get("/books/2");
        ResultActions actions=mvc.perform(builder);


    }
}
