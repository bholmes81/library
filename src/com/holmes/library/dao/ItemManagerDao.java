package com.holmes.library.dao;

import java.util.List;

import com.holmes.library.model.Item;

public interface ItemManagerDao {
  Item fetchItemByName(String name);

  Item fetchItemById(int id);

  List<Item> fetchAllItems();

  void insertItem(Item item);

  void updateItem(Item item);

  void deleteItem(Item item);
}
