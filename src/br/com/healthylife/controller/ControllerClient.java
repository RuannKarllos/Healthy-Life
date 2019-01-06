/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.presentation.Login;
import br.com.healthylife.presentation.MainScreenClient;
import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Client;
import br.com.healthylife.entity.Entity;
import br.com.healthylife.util.Factory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author ruann
 */
public class ControllerClient {

    IDao<Client> dc = Factory.getDao(Client.class);
    MainScreenClient msC;
    Client c;
    Login l = new Login();

    public void registerClient(String name, String CPF, int age, String sex, String email, String phoneNumber, String date, String password) throws Exception {
        c = new Client(name, CPF, age, sex, email, phoneNumber, date, password);

        String folder = "Client";
        File file = new File(folder, CPF + ".data");

        if (checkFields(name, CPF, age, sex, email, phoneNumber, date, password)) {
            if (validateCPF(CPF)) {
                if (!file.exists()) {
                    dc.insert(c);
                } else {
                    throw new Exception("Cliente já foi cadastrado!");
                }
            } else {
                throw new Exception("CPF inválido!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes!");
        }

    }

    public boolean checkLogin(String login, String password) throws FileNotFoundException, IOException, ClassNotFoundException {

        String folder = "Client";

        File file = new File(folder, login + ".data");

        if (file.exists()) {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Client client = (Client) ois.readObject();

            if (password.equals(client.getPassword())) {

                msC = new MainScreenClient();

                msC.setVisible(true);

                return true;
            }
        }
        return false;
    }

    public void update(String name, String CPF, int age, String sex, String email, String phoneNumber, String date, String password) throws Exception {
        String folder = "Client";
        File file = new File(folder, CPF + ".data");

        if (checkFields(name, CPF, age, sex, email, phoneNumber, date, password)) {
            if (validateCPF(CPF)) {
                if (file.exists()) {
                    dc.update(c);
                } else {
                    throw new Exception("Cliente não foi cadastrado!");
                }
            } else {
                throw new Exception("CPF inválido!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes!");
        }

    }

    public void delete(String id) throws Exception {
        dc.delete(id);
    }

    public Entity search(String id) {
        return dc.search(id);
    }

    private boolean checkFields(String name, String CPF, int age, String sex, String email, String phoneNumber, String date, String password) {
        return name.length() <= 0 || CPF.length() <= 0 || age >= 18 || sex.length() <= 0
                || email.length() <= 0 || phoneNumber.length() <= 0 || date.length() <= 0 || password.length() <= 0;
    }

    public boolean validateCPF(String strCpf) {
        int d1, d2;
        int digit1, digit2, rest;
        int digitCPF;
        String digitResult;

        d1 = d2 = 0;
        digit1 = digit2 = rest = 0;

        for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
            digitCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount));

            d1 = d1 + (11 - nCount) * digitCPF;

            d2 = d2 + (12 - nCount) * digitCPF;
        }

        rest = (d1 % 11);

        if (rest < 2) {
            digit1 = 0;
        } else {
            digit1 = 11 - rest;
        }

        d2 += 2 * digit1;

        rest = (d2 % 11);

        if (rest < 2) {
            digit2 = 0;
        } else {
            digit2 = 11 - rest;
        }

        String digitValidate = strCpf.substring(strCpf.length() - 2, strCpf.length());

        digitResult = String.valueOf(digit1) + String.valueOf(digit2);

        return digitValidate.equals(digitResult);
    }

}
