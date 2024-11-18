package br.com.observer.observers;

import br.com.observer.enums.TaskStatus;
import br.com.observer.factory.TaskFactory;
import br.com.observer.interfaces.Observer;

public class UserNotifier implements Observer {
    @Override
    public void notify(String name, String username, TaskStatus status) {
        System.out.println(TaskFactory.createTaskMessage(name, username ,status));
    }
}
