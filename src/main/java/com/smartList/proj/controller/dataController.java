package com.smartList.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class dataController{

//  Item item = new Item();

  @RequestMapping("/quickList")
  public String quickListPage(){
    return "quickList";
  }

  @PostMapping("/quickList")
  public String addListItem(HttpServletRequest req, Model model){



    String item = req.getParameter("item");
    int qty = Integer.parseInt(req.getParameter("qty"));

    model.addAttribute("item", item);
    model.addAttribute("qty", qty);

    return "/quickList";
  }

}
