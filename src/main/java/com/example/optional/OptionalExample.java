package com.example.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Student std = new Student("venkat","Narayana","Bnagalore") ;
    Optional<Student> obj = Optional.of(std);
        Optional<String> city  =  Optional.ofNullable("Bangalore");
        System.out.println(city);
    }
}
class Student{
    String name ;
    String school ;
    String city ;
    Student(String name , String school , String city){
        this.city = city ;
        this.school = school ;
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
