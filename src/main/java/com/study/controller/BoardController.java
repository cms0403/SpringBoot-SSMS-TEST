package com.study.controller;

import com.study.command.BoardVo;
import com.study.service.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
    @Autowired
    BoardService service;

    @GetMapping("/")
    public String list(Model model, HttpServletRequest request) {
        ArrayList<BoardVo> BoardList = service.selectBoard();
        model.addAttribute("BoardList", BoardList);
        return "board/list.html";
    }

    @GetMapping("/post")
    public String post() {
        return "board/post.html";
    }

    @GetMapping("/test")
    public String test() {
        return "board/test.html";
    }

    @GetMapping("/login")
    public String login() {
        return "board/login.html";
    }

}