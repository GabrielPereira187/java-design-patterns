package br.com.observer.observers;

import br.com.observer.enums.TaskStatus;
import br.com.observer.factory.TaskFactory;
import br.com.observer.interfaces.Observer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ReportNotifier implements Observer {
    @Override
    public void notify(String name, String username, TaskStatus status) {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskFactory.createTaskMessage(name, username, status)).append(" at ").append(LocalDateTime.now());
        String filePath = "task_data.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(sb.toString());
            writer.newLine();
            System.out.println("Task added successfully to the file");
        } catch (IOException e) {
            System.err.println("Error to write on the file");
        }

    }
}
