package com.greenfox.practice.services;

import com.greenfox.practice.models.Items;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface ItemsService {
  List<Items> listAllItems ();
  List<String> getDistinctItemNames();
  List<String> getDistinctItemSizes();
  Items getNameAndSize(String name, String size);
}
