package br.com.observer.enums;

public enum TaskStatus {
    IN_PROGRESS("in_progress"),
    COMPLETED("completed");

    public final String description;

    TaskStatus(String description) {
        this.description = description;
    }
}
