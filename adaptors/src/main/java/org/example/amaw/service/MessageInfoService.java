package org.example.amaw.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.example.amaw.dto.MessageInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@Service
public class MessageInfoService {

  @Autowired
  private JavaMailSender emailSender;

  @Autowired
  private TemplateEngine templateEngine;

  public void sendSimpleMessage(MessageInfoDto messageInfoDto) {

    SimpleMailMessage message = new SimpleMailMessage();

    message.setTo(messageInfoDto.getEmail());
    message.setSubject("hsfdsdf");
    message.setText(messageInfoDto.getText());
    emailSender.send(message);

  }

  public void sendTemplateMessage(MessageInfoDto messageInfoDto) {
    try {
      MimeMessage mimeMessage = emailSender.createMimeMessage();
      MimeMessageHelper helper = null;

      helper = new MimeMessageHelper(mimeMessage, true);

      // Process the template with the given context
      Context context = new Context();
      // Set variables for the template from the POST request data
      context.setVariable("name", "haaa");
      context.setVariable("message", messageInfoDto.getText());
      context.setVariable("subject", messageInfoDto.getSubject());
      String htmlContent = templateEngine.process("emailTemplate", context);

      // Set email properties
      helper.setTo(messageInfoDto.getEmail());
      helper.setSubject(messageInfoDto.getSubject());
      helper.setText(htmlContent, true); // Set true for HTML content

      // Send the email
      emailSender.send(mimeMessage);
    } catch (MessagingException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }


  }


}
