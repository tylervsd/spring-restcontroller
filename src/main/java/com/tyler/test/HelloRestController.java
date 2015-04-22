package com.tyler.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyler.domain.Message;

@RestController
public class HelloRestController {
 
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {
 
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
 
} 
