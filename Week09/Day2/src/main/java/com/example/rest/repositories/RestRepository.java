package com.example.rest.repositories;

import com.example.rest.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<Log, Long> {
}
