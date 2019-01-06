/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.presentation.MainScreenMedic;
import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Medic;
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
public class ControllerMedic {

    IDao<Medic> dm = Factory.getDao(Medic.class);
    Medic m;
    MainScreenMedic msM;

    public boolean checkLogin(String login, String password) throws FileNotFoundException, IOException, ClassNotFoundException {
        String folder = "Medic";

        File file = new File(folder, login + ".data");

        if (file.exists()) {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Medic medic = (Medic) ois.readObject();

            if (password.equals(medic.getPassword())) {

                msM = new MainScreenMedic();

                msM.setVisible(true);

                return true;
            }
        }

        return false;
    }

    public void register(String name, String CPF, int age, String sex, String email, String phoneNumber, int crm, String password) throws Exception {

        m = new Medic(name, CPF, age, sex, email, phoneNumber, crm, password);

        String folder = "Medic";
        File file = new File(folder, String.valueOf(crm) + ".data");

        if (checkFields(name, CPF, age, sex, email, phoneNumber, crm, password)) {
            if (validateCPF(CPF)) {
                if (!file.exists()) {
                    dm.insert(m);
                } else {
                    throw new Exception("Médico já foi cadastrado!");
                }
            } else {
                throw new Exception("CPF inválido!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes! \nVerifique os campos de IDADE e CRM!");
        }
    }

    public void update(String name, String CPF, int age, String sex, String email, String phoneNumber, int crm, String password) throws Exception {
        m = new Medic(name, CPF, age, sex, email, phoneNumber, crm, password);

        String folder = "Medic";
        File file = new File(folder, String.valueOf(crm) + ".data");

        if (checkFields(name, CPF, age, sex, email, phoneNumber, crm, password)) {
            if (validateCPF(CPF)) {
                if (file.exists()) {
                    dm.update(m);
                } else {
                    throw new Exception("Médico já foi cadastrado!");
                }
            } else {
                throw new Exception("CPF inválido!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes! \nVerifique o campo CRM!");
        }
    }

    public void delete(String id) throws Exception {
        dm.delete(id);
    }

    public Medic search(String id) {
        return (Medic) dm.search(id);
    }

    private boolean checkFields(String name, String CPF, int age, String sex, String email, String phoneNumber, int crm, String password) {
        return name.length() <= 0 || CPF.length() <= 0 || age >= 18 || sex.length() <= 0
                || email.length() <= 0 || phoneNumber.length() <= 0 || String.valueOf(crm).length() < 3 || password.length() <= 0;
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
