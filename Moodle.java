package com.company;

import java.util.ArrayList;
import java.util.List;

public class Moodle implements  Subject{
    List<String> assignments = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addAssignment(String assignment){
        this.assignments.add(assignment);
        notifyAllStudent();
    }

    public void removeAssignment(String assignment){
        this.assignments.remove(assignment);
        notifyAllStudent();
    }

    @Override
    public void registerStudent(Observer student) {
        this.subscribers.add(student);

    }

    @Override
    public void unregisterStudent(Observer student) {
        this.subscribers.remove(student);

    }

    @Override
    public void notifyAllStudent() {
        for (Observer student: subscribers) {
            student.update(this.assignments);
        }

    }
}
