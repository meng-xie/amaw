package org.example.amaw.service;

import org.example.amaw.dto.MessageInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MessageInfoService {

  @Autowired
  private JavaMailSender emailSender;

  public void sendSimpleMessage(MessageInfoDto messageInfoDto) {

    SimpleMailMessage message = new SimpleMailMessage();

    message.setTo(messageInfoDto.getEmail());
    message.setSubject("hsfdsdf");
    message.setText(messageInfoDto.getText());
    emailSender.send(message);

  }


}
