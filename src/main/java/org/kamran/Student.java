package org.kamran;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private int id;
    private String name;
    private String city;
    private int age;

    private Certificate certi;

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

    public Student(int id, String name, String city, int age) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public Student(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
