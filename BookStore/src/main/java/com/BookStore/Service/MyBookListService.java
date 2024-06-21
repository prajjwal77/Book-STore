package com.BookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStore.Entity.MyBookList;
import com.BookStore.Repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
     public MyBookRepository myBook;
	
	public void saveMyBook(MyBookList book) {
		myBook.save(book);
	}
	
	public List<MyBookList> getAllBooks() {
		return myBook.findAll();
	}
	
	public void deleteViaId(int id) {
	myBook.deleteById(id);	
	}
}
