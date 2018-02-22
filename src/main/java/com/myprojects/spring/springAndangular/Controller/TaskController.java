package com.myprojects.spring.springAndangular.Controller;

import com.myprojects.spring.springAndangular.Domain.Task;
import com.myprojects.spring.springAndangular.Service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final Logger log = LoggerFactory.getLogger(TaskController.class);
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = {"","/"})
    public Iterable<Task> listTasks() {
        return taskService.list();
    }

    @PostMapping( "/save" )
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }
}
