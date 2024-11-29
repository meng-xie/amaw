package org.example.amaw.controller;

import org.example.amaw.dto.MessageInfoDto;
import org.example.amaw.service.MessageInfoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amawservice/email")
public class MessageInfoController {
    MessageInfoService messageInfoService;

    public MessageInfoController(MessageInfoService messageInfoService) {
        this.messageInfoService = messageInfoService;
    }



    @PostMapping(value = "/send", produces = MediaType.APPLICATION_JSON_VALUE,consumes =   MediaType.APPLICATION_JSON_VALUE)
    public String sendEmail(@RequestBody MessageInfoDto message) {
        messageInfoService.sendSimpleMessage(message);
        return "success";
    }
}