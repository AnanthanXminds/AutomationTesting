package com.test;

public class Student {
    private  String name;
    private Integer age;
    public Integer getAge(){
        return this.age;
    }
    public Student(){
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String args[]){
        Student student1 = new Student();
        student1.setName("Jenkins");
        student1.setAge(33);
    }
}
