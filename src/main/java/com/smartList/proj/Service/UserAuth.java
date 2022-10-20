package com.smartList.proj.Service;

public class UserAuth {

  private final String pass = "password";
  private final String email = "benji@email.com";

  public Boolean validateUser(String userEmail, String password){
    if(email.equalsIgnoreCase(this.email) && password.equals(pass)){
      return true;
    }else{
      return false;
    }
  }

}
