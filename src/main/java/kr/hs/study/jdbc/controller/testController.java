package kr.hs.study.jdbc.controller;

import kr.hs.study.jdbc.dto.myuserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {

    @GetMapping("/write_form")
    public String write_form(){
        return "write_form";
    }

    @PostMapping("/user")
    public String user(myuserDTO dto){
        System.out.println(dto.getId() + dto.getName());
        return "user";
    }

}
