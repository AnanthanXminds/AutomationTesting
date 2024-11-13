package com.test;

public class Student {
    private Integer id;
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
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public Student(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public static void main(String args[]){
        Student student1 = new Student();
        student1.name = "Ananthan";
        student1.id = 1;
        student1.age = 27;
        Student student2 = new Student();
        student2.setName("Jenkins");
        student2.setAge(33);
        student2.setId(2);
    }
}
