package br.com.healthylife.entity;

import java.io.Serializable;

public class Employee extends Manager implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String password;
    
    public Employee(String name, String CPF, int age, String sex, String email, String phoneNumber, String password) {
        super(name, CPF, age, sex, email, phoneNumber);
        this.password = password;
    }

    @Override
    public String getID() {
        return getCPF();
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
