package com.webApp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class authController {

  @RequestMapping("/")
  public String Home(){
    return "home";
  }

  @RequestMapping("/login")
  public String login(){
    return "login";
  }

  @RequestMapping("/account")
  public String accountPage(){
    return "account";
  }

  @PostMapping("/login")
  public String account(HttpServletRequest req, HttpServletResponse res, Model model){
    String email = req.getParameter("email");
    String pass = req.getParameter("password");

    model.addAttribute("email", email);
    model.addAttribute("password", pass);

    System.out.println("Logged in!");

    return "home";
  }

}
