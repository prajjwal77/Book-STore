package com.BookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BookStore.Service.MyBookListService;

@Controller
public class MyBookListController {

	@Autowired
	private MyBookListService  myBookListService;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteById(@PathVariable("id") int id) {
		myBookListService.deleteViaId(id);
		return "redirect:/my_books";
	}
}
