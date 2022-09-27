package com.itheima.contorller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BoolController {

    @GetMapping("/{id}")
    public String getByid(@PathVariable Integer id){
        System.out.println("id=====>"+ id);
        return "hello,springboot";
    }

}
