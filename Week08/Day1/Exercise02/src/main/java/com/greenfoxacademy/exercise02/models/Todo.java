package com.greenfoxacademy.exercise02.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "todo")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private boolean urgent;
  private boolean done;

  @OneToOne(fetch = FetchType.LAZY)
  private Assignee assignee;

  public Todo() {
    this.done = false;
    this.urgent = false;
  }

  public Todo(String title) {
    this.title = title;
  }

  public Todo(int id, String title, boolean urgent, boolean done) {
    this.id = id;
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}

