package com.example.demo.service;


import com.example.demo.model.Message;
import com.example.demo.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {


    private MessageRepo messageRepo;

    @Autowired
    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }


   public List<Message> getAll() {
        return messageRepo.findAll();
    }

    public void addMessage(Message message) {
        messageRepo.save(message);
    }


}
