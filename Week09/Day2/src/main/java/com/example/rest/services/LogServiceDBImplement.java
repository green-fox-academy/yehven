package com.example.rest.services;

import com.example.rest.models.Logs.Log;
import com.example.rest.repositories.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceDBImplement implements LogService{

  @Autowired
  RestRepository restRepository;

  @Override
  public List<Log> getAllLogs() {
    List<Log> logs = new ArrayList<>();
    restRepository.findAll().forEach(logs::add);
    return logs;
  }

  @Override
  public Log getLog(Long id) {
    return restRepository.findOne(id);
  }

  @Override
  public void createLog(Log log) {
    restRepository.save(log);
  }

  @Override
  public void setEndPoint(Long id, String input) {
    restRepository.findOne(id).setEndpoint(input);
  }

  @Override
  public void setData(Long id, String input) {
    restRepository.findOne(id).setData(input);
  }

  @Override
  public void deleteLog(Long id) {
    restRepository.delete(id);
  }

}
