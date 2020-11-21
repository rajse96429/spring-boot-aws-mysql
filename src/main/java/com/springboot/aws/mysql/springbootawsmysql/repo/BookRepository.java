package com.springboot.aws.mysql.springbootawsmysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.aws.mysql.springbootawsmysql.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
