package com.company;

import java.util.List;

public class Student implements Observer{

    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> assignments) {
        System.out.println(this.name  +"\n"  + " We have some changes in assignments"  +"\n"  + assignments  +"\n" );
    }

}
