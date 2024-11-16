package br.com.observer.entities;

import br.com.observer.enums.TaskStatus;
import br.com.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String username;
    private TaskStatus status;
    private List<Observer> observers = new ArrayList<>();

    public Task(String name, String username, TaskStatus status, List<Observer> observers) {
        this.name = name;
        this.username = username;
        this.status = status;
        this.observers = observers;
        notifyObservers(this.name, this.username, this.status);
    }

    public void completeTask() {
        this.status = TaskStatus.COMPLETED;
        notifyObservers(this.name, this.username, this.status);
    }

    private void notifyObservers(String name, String username, TaskStatus status) {
        for (Observer observer : observers) {
            observer.notify(name, username, status);
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
}
