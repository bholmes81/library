package com.holmes.library.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.holmes.library.dao.UserManagerDao;
import com.holmes.library.model.User;

public class UserManagerMemoryDao implements UserManagerDao {

  private int nextUserId = 0;
  List<User> users = new ArrayList<User>();
  
  @Override
  public User fetchUserById(Integer id) {
    for (User user : users) {
      if (user.getId() == id) {
        return user;
      }
    }
    throw new RuntimeException("User Not Found: " + id);
  }

  @Override
  public List<User> fetchAllUsers() {
    return users;
  }

  @Override
  public void insertUser(User user) {
    user.setId(nextUserId++);
    users.add(user);
  }

  @Override
  public void updateUser(User user) {
    User editUser = fetchUserById(user.getId());
    editUser.setBirthDate(user.getBirthDate());
    editUser.setCity(user.getCity());
    editUser.setEmail(user.getEmail());
    editUser.setName(user.getName());
    editUser.setState(user.getState());
  }

  @Override
  public void deleteUser(User user) {
    User delUser = fetchUserById(user.getId());
    users.remove(delUser);

  }

}

