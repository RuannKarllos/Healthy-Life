package br.com.healthylife.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client extends Person implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private double payment = 150;
    private String dueDate;
    private String login;
    private String password;

    public Client() {

    }

    public Client(String name, String CPF, int age, String sex, String email, String phoneNumber, String date, String password) {
        super(name, CPF, age, sex, email, phoneNumber);
        this.dueDate = date;        
        this.password = password;
    }

    @Override
    public String getID() {
        return getCPF();
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin() {
        this.login = getCPF();
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Date formataData(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }
        Date date = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
            date = (Date) formatter.parse(data);
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }
}
