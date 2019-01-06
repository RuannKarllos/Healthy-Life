package br.com.healthylife.entity;

import java.io.Serializable;

public class Medic extends Person implements Serializable {

    private int crm;
    private String password;

    public Medic(String name, String CPF, int age, String sex, String email, String phoneNumber, int crm, String password) {
        super(name, CPF, age, sex, email, phoneNumber);
        this.crm = crm;
        this.password = password;

    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getID() {
        return String.valueOf(crm);
    }

}
