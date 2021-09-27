package com.company;

public interface Subject {
    void registerStudent(Observer student);
    void unregisterStudent(Observer student);
    void notifyAllStudent();
}
