package com.myprojects.spring.springAndangular.Repository;

import com.myprojects.spring.springAndangular.Domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {
}
