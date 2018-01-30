package com.greenfox.practice.services;

import com.greenfox.practice.models.Items;
import com.greenfox.practice.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    return itemsRepository.findByItemNameAndSize(name,size);
  }


}
