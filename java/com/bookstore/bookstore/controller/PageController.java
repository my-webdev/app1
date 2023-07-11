package com.bookstore.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
 @GetMapping("/")
 public String mainpage(Model model) {
	 model.addAttribute("mTable", "Books");
	 return "home";
 }

 @GetMapping("/bookscreator")
 public String createboot() {
	 return "bookscreator";
 }
 @GetMapping("/booklist")
 public String listOfBooks(Model model) {
	 model.addAttribute("days", new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"});
	 System.out.println(model);
	 return "booklist";
 }
 @GetMapping("/create")
 public String addAbook() {
	 return "bookscreator";
 }
}
