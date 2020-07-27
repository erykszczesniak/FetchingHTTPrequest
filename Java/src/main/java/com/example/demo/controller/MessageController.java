package com.example.demo.controller;


import com.example.demo.model.Message;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

private MessageService messageService;


    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }


    @GetMapping
    public List<Message>getAll(){
        return messageService.getAll();
    }

    @PostMapping("/messages")

    public  void addMessage(@RequestBody Message message){
        messageService.addMessage(message);
    }
}
