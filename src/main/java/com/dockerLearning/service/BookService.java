package com.dockerLearning.service;

import com.dockerLearning.entity.Book;
import com.dockerLearning.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepo bookRepo;

    public String save(Book book){
        bookRepo.save(book);
        return "Successfully saved.!";
    }

    public Book getBook(Long id){
        return bookRepo.findById(id).orElse(null);
    }

    public List<Book> getAll(){
        return bookRepo.findAll();
    }
}
