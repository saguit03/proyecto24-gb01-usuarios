package es.unex.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLogIn {
    @JsonProperty("username")

  private String username = null;

  @JsonProperty("password")

  private String password = null;


public UserLogIn (){
    this.username = null;
    this.password = null;
  }
  public UserLogIn (String username, String password){
    this.username = username;
    this.password = password;
  }

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

  
}
