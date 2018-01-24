package com.example.rest.services;

import com.example.rest.models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
  List<Log> getAllLogs();
  Log getLog(Long id);
  void createLog(Log log);
  void setEndPoint(Long id, String input);
  void setData(Long id, String input);
  void deleteLog(Long id);
}
