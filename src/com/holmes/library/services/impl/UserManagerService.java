package com.holmes.library.services.impl;

import java.util.Arrays;

import com.holmes.library.dao.UserManagerDao;
import com.holmes.library.model.UserRequest;
import com.holmes.library.model.UserResponse;
import com.holmes.library.services.UserManager;

public class UserManagerService implements UserManager {
  private UserManagerDao userDao;

  public UserManagerDao getUserDao() {
    return userDao;
  }

  public void setUserDao(UserManagerDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public UserResponse fetchUserById(UserRequest request) {
    final UserResponse response = new UserResponse();

    try {
      response.setUsers(Arrays.asList(getUserDao().fetchUserById(
          request.getUser().getId())));
    } catch (final Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e.getMessage());
    }

    return response;
  }

  @Override
  public UserResponse fetchAllUsers(UserRequest request) {
    final UserResponse response = new UserResponse();

    try {
      response.setUsers(getUserDao().fetchAllUsers());
    } catch (final Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e.getMessage());
    }

    return response;
  }

  @Override
  public UserResponse insertUser(UserRequest request) {
    final UserResponse response = new UserResponse();

    try {
      getUserDao().insertUser(request.getUser());
    } catch (final Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e.getMessage());
    }

    return response;
  }

  @Override
  public UserResponse updateUser(UserRequest request) {
    final UserResponse response = new UserResponse();

    try {
      getUserDao().updateUser(request.getUser());
    } catch (final Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e.getMessage());
    }

    return response;
  }

  @Override
  public UserResponse deleteUser(UserRequest request) {
    final UserResponse response = new UserResponse();

    try {
      getUserDao().deleteUser(request.getUser());
    } catch (final Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e.getMessage());
    }

    return response;
  }
}