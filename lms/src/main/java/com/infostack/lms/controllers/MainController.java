package com.infostack.lms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping("books/insert")
    public String insert() {
        return "insert-book";
    }

    @RequestMapping("books/edit/{id}")
    public String edit() {
        return "edit-book";
    }

    @RequestMapping("books/delete/{id}")
    public String delete() {
        return "redirect:/books";
    }

    @RequestMapping("books/{id}")
    public String view() {
        return "view-book";
    }

    @RequestMapping("books")
    public String list() {
        return "list-book";
    }
}
