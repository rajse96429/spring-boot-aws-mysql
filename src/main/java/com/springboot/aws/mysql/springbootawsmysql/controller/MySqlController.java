package com.springboot.aws.mysql.springbootawsmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.aws.mysql.springbootawsmysql.entity.Book;
import com.springboot.aws.mysql.springbootawsmysql.repo.BookRepository;

@RestController
@RequestMapping("/book")
public class MySqlController {
	
	 @Autowired
	    private BookRepository bookRepository;

	    @PostMapping
	    public Book saveBook(@RequestBody Book book) {
	        return bookRepository.save(book);
	    }

	    @GetMapping
	    public List<Book> findBooks() {
	        return bookRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public Book findBook(@PathVariable int id) throws Exception  {
	        Book book = bookRepository.findById(id).orElseThrow(() -> new Exception("Book not available"));
	        return book;
	    }
}
