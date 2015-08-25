package com.holmes.library.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.holmes.library.model.ItemRequest;
import com.holmes.library.model.ItemResponse;

@Consumes("application/json")
@Produces("application/json")
public interface ItemManager {
  @POST
  @Path("/fetchItemByName/")
  public ItemResponse fetchItemByName(ItemRequest request);

  @POST
  @Path("/fetchItemById/")
  public ItemResponse fetchItemById(ItemRequest request);

  @POST
  @Path("/fetchAllItems/")
  public ItemResponse fetchAllItems(ItemRequest request);

  @POST
  @Path("/insertItem/")
  public ItemResponse insertItem(ItemRequest request);

  @POST
  @Path("/updateItem/")
  public ItemResponse updateItem(ItemRequest request);

  @POST
  @Path("/deleteItem/")
  public ItemResponse deleteItem(ItemRequest request);
}