package br.com.healthylife.entity;

import java.io.Serializable;

public abstract class Person extends Entity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String CPF;
    private int age;
    private String sex;
    private String email;
    private String phoneNumber;

    public Person(String name, String CPF, int age, String sex, String email, String phoneNumber) {
        this.name = name;
        this.CPF = CPF;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
