package com.mint.demo.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.annotation.WebServlet;

@Controller
@WebServlet("/board")
@RequestMapping(value = "/board/*")
public class boardController {

    @GetMapping(value = "list")
    public String board() {
        return "board/boardList";
    }
}
