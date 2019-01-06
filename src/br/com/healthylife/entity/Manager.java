package br.com.healthylife.entity;

import java.io.Serializable;

public class Manager extends Person implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public Manager(String name, String CPF, int age, String sex, String email, String phoneNumber) {
        super(name, CPF, age, sex, email, phoneNumber);
    }

    @Override
    public String getID() {
        return getCPF();
    }
}
