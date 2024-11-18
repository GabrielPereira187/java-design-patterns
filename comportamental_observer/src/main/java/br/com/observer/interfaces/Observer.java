package br.com.observer.interfaces;

import br.com.observer.enums.TaskStatus;

public interface Observer {
    void notify(String name, String username,TaskStatus status);
}
