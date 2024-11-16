package br.com.observer;

import br.com.observer.entities.Task;
import br.com.observer.factory.TaskFactory;
import br.com.observer.interfaces.Observer;
import br.com.observer.observers.ReportNotifier;
import br.com.observer.observers.UserNotifier;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        List<Observer> observerList = new ArrayList<>();

        observerList.add(new UserNotifier());
        observerList.add(new ReportNotifier());

        Task task = factory.createTask("Task_1", "Gabriel", observerList);
        task.completeTask();
    }
}