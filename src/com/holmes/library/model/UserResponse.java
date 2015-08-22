package com.holmes.library.model;

import java.util.List;

public class UserResponse {
  
  private List<User> users;
  public List<User> getUsers() {
    return users;
  }
  public void setUsers(List<User> users) {
    this.users = users;
  }
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  private String errorMessage;
  private Boolean success = true;

}
