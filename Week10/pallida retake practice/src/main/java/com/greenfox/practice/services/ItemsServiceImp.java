package com.greenfox.practice.services;

import com.greenfox.practice.models.Response;
import com.greenfox.practice.models.Items;
import com.greenfox.practice.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImp implements ItemsService {
  @Autowired
  ItemsRepository itemsRepository;

  @Override
  public List<Items> listAllItems() {
    return (List<Items>) itemsRepository.findAll();
  }

  @Override
  public List<String> getDistinctItemNames() {
    return itemsRepository.getDistinctItemNames();
  }

  @Override
  public List<String> getDistinctItemSizes() {
    return itemsRepository.getDistinctItemSizes();
  }

  @Override
  public Items getNameAndSize(String name, String size) {
    return itemsRepository.findByItemNameAndSize(name, size);
  }

  @Override
  public Response result(Integer number, String type) {
    Response response = new Response();
    response.setResult("ok");
    if (!type.equals(null) || number != null) {
      if (type.equals("lower")) {
        response.setResult("ok");
        response.setItemslist(itemsRepository.getAllByUnitPriceLessThan(number));
        return response;
      } else if (type.equals("higher")) {
        response.setResult("ok");
        response.setItemslist(itemsRepository.getAllByUnitPriceGreaterThan(number));
        return response;
      } else if (type.equals("equal")) {
        response.setResult("ok");
        response.setItemslist(itemsRepository.getAllByUnitPriceEquals(number));
        return response;
      }else {
        response.setResult("Not ok");
        return response;
      }
    }else {
      response.setResult("not ok");
      return response;
    }
  }
}
