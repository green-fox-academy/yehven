package com.greenfox.practice.repositories;

import com.greenfox.practice.models.Items;
import com.greenfox.practice.models.Response;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends CrudRepository<Items, Integer> {

  @Query(value = "SELECT DISTINCT item_name FROM warehouse", nativeQuery = true)
  List<String> getDistinctItemNames();

  @Query(value = "SELECT DISTINCT size FROM warehouse", nativeQuery = true)
  List<String> getDistinctItemSizes();

  Items findByItemNameAndSize(String itemName, String size);

  List<Items> getAllByUnitPriceLessThan(Integer number);
  List<Items> getAllByUnitPriceGreaterThan(Integer number);
  List<Items> getAllByUnitPriceEquals(Integer number);
 }
