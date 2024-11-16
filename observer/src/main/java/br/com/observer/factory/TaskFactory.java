package br.com.observer.factory;

import br.com.observer.entities.Task;
import br.com.observer.enums.TaskStatus;
import br.com.observer.interfaces.Observer;

import java.util.Collections;
import java.util.List;

public class TaskFactory {

    public Task createTask(String name, String username, List<Observer> observers) {
        return new Task(name, username, TaskStatus.IN_PROGRESS, observers);
    }

    public static String createTaskMessage(String name,String username, TaskStatus status) {
        return String.format("Task with name %s is %s by %s", name, status.description, username);
    }

}
