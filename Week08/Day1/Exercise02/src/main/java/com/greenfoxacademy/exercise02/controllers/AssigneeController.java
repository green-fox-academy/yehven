package com.greenfoxacademy.exercise02.controllers;

import com.greenfoxacademy.exercise02.models.Assignee;
import com.greenfoxacademy.exercise02.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

  @Autowired
  private AssigneeRepository assigneeRepo;

  @GetMapping({"/", ""})
  public String assignees(Model model) {
    model.addAttribute("assignees", assigneeRepo.findAll());
    model.addAttribute("assignee", new Assignee());
    return "assignees";
  }

  @PostMapping("/newAssignee")
  public String newAssignee(@ModelAttribute Assignee assignee) {
    assigneeRepo.save(assignee);
    return "redirect:/assignees";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable Long id) {
    assigneeRepo.delete(id);
    return "redirect:/assignees";
  }

  @GetMapping("/{id}/editAssignee")
  public String edit(@PathVariable Long id, Model model) {
    model.addAttribute("assignee", assigneeRepo.findOne(id));
    return "editAssignee";
  }

  @PostMapping("/{id}/editAssignee")
  public String update(Assignee assignee) {
    assigneeRepo.save(assignee);
    return "redirect:/assignees";
  }
}
