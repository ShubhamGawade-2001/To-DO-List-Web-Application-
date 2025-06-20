package com.app.todo.repository;

import com.app.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
