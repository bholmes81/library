package com.holmes.library.dao;

import java.util.List;

import com.holmes.library.model.User;

public interface UserManagerDao {
  User fetchUserById(Integer id);

  List<User> fetchAllUsers();

  void insertUser(User user);

  void updateUser(User user);

  void deleteUser(User user);
}
