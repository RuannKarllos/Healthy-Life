/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.presentation.MainScreenAdm;
import br.com.healthylife.presentation.MainScreenEmployee;
import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Client;
import br.com.healthylife.entity.Employee;
import br.com.healthylife.entity.Entity;
import br.com.healthylife.entity.Manager;
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
public class ControllerAdm {

    IDao<Manager> dM = Factory.getDao(Manager.class);
    IDao<Employee> de = Factory.getDao(Employee.class);
    IDao<Medic> dm = Factory.getDao(Medic.class);
    IDao<Client> dc = Factory.getDao(Client.class);

    MainScreenAdm msAdm = new MainScreenAdm();
    
    public boolean checkLogin(String login, String password) throws FileNotFoundException, IOException, ClassNotFoundException {
        if (login.equals("0000") && password.equals("0000")) {
            msAdm.setVisible(true);
            return true;
        }
        return false;
    }
    
    public void deleteMedical(String id) throws Exception {
        dm.delete(id);
    }

    public void deleteClient(String id) throws Exception {
        dc.delete(id);
    }

    public void makeAppointment() {

    }
}
