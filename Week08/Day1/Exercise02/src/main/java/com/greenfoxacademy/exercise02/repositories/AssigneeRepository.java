package com.greenfoxacademy.exercise02.repositories;

        import com.greenfoxacademy.exercise02.models.Assignee;
        import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long>{
}
