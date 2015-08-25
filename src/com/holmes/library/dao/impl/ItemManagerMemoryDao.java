package com.holmes.library.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.holmes.library.dao.ItemManagerDao;
import com.holmes.library.model.Item;

public class ItemManagerMemoryDao implements ItemManagerDao {

  private int nextItemId = 0;
  List<Item> items = new ArrayList<Item>();

  @Override
  public Item fetchItemByName(String name) {
    for (final Item item : items) {
      if (item.getName().equals(name)) {
        return item;
      }
    }
    throw new RuntimeException("Item not found: " + name);
  }

  @Override
  public Item fetchItemById(int id) {
    for (final Item item : items) {
      if (item.getId() == id) {
        return item;
      }
    }
    throw new RuntimeException("Item not found: " + id);
  }

  @Override
  public List<Item> fetchAllItems() {
    return items;
  }

  @Override
  public void insertItem(Item item) {
    item.setId(nextItemId++);
    items.add(item);
  }

  @Override
  public void updateItem(Item item) {
    final Item editItem = fetchItemById(item.getId());
    editItem.setGenre(item.getGenre());
    editItem.setName(item.getName());
    editItem.setType(item.getType());
  }

  @Override
  public void deleteItem(Item item) {
    final Item deleteItem = fetchItemById(item.getId());
    items.remove(deleteItem);
  }

}
