package org.example.java_service.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.example.java_service.model.Paragraph;
import org.example.java_service.model.Text;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "Hello";
    }


    @PostMapping("/count-letters")
    public Integer countLetters(@RequestBody Paragraph paragraph){

        return paragraph.getSize();
    }

    @PostMapping("/replace-special-chars")
    public String countLetters(@RequestBody Text text){
        return text.getTe();
    }



}
