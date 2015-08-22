package com.holmes.library.services.impl;

import java.util.Arrays;

import com.holmes.library.dao.ItemManagerDao;
import com.holmes.library.model.ItemRequest;
import com.holmes.library.model.ItemResponse;
import com.holmes.library.services.ItemManager;

public class ItemManagerService implements ItemManager {
  
  private ItemManagerDao itemDao;

  public ItemManagerDao getItemDao()
  {
    return itemDao;
  }

  public void setItemDao(ItemManagerDao itemDao)
  {
    this.itemDao = itemDao;
  }

  @Override
  public ItemResponse fetchItemByName(ItemRequest request) {
    ItemResponse response = new ItemResponse();
    try {
      response.setItems(Arrays.asList(getItemDao().fetchItemByName(request.getItem().getName())));
    } catch (Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e);
    }
    return response;
  }

  @Override
  public ItemResponse fetchItemById(ItemRequest request) {
    ItemResponse response = new ItemResponse();
    try {
      response.setItems(Arrays.asList(getItemDao().fetchItemById(request.getItem().getId())));
    } catch (Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e);
    }
    return response;
  }

  @Override
  public ItemResponse fetchAllItems(ItemRequest request) {
    ItemResponse response = new ItemResponse();
    try {
      response.setItems(getItemDao().fetchAllItems());
    } catch (Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e);
    }
    return response;
  }

  @Override
  public ItemResponse insertItem(ItemRequest request) {
    ItemResponse response = new ItemResponse();
    try {
      getItemDao().insertItem(request.getItem());
    } catch (Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e);
    }
    return response;
  }

  @Override
  public ItemResponse updateItem(ItemRequest request) {
    ItemResponse response = new ItemResponse();
    try {
      itemDao.updateItem(request.getItem());
    } catch (Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e);
    }
    return response;
  }

  @Override
  public ItemResponse deleteItem(ItemRequest request) {
    ItemResponse response = new ItemResponse();
    try {
      getItemDao().deleteItem(request.getItem());
    } catch (Exception e) {
      response.setSuccess(false);
      response.setErrorMessage(e.getClass() + ": " + e);
    }
    return response;
  }

}
