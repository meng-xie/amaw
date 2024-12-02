package org.example.amaw.service;


import org.example.amaw.model.User;
import org.example.amaw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;


  public User save(User User) {
    return userRepository.save(User);
  }


  public User findByUserId(String userId) {
    return userRepository.findByUserId(userId);
  }

  public User findByUserNameAndPassword(String userName, String password) {
    return userRepository.login(userName, password);
  }


  public User forgetPassword(String userName, String verifyCode) {
    return userRepository.forgotPassword(userName, verifyCode);
  }


}