package com.minhee.springbootstudy.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController {

    @GetMapping
    public String boardIndex() {
        return "/board/index";
    }

}
