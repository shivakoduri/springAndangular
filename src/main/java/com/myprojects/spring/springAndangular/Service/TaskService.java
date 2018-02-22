package com.myprojects.spring.springAndangular.Service;

import com.myprojects.spring.springAndangular.Domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
