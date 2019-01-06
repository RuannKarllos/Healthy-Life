/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Hospital;
import br.com.healthylife.util.Factory;
import java.io.File;

/**
 *
 * @author ruann
 */
public class ControllerHospital {

    IDao<Hospital> dh = Factory.getDao(Hospital.class);
    Hospital h;
    
    public void register(String cod, String name, String adress, String district, String city) throws Exception {
        h = new Hospital(cod, name, adress, district, city);
       
        String folder = "Hospital";
        File file = new File(folder, cod + ".data");
        
        if (!checkFields(cod, name, adress, district, city)) {
            if (!file.exists()) {
                dh.insert(h);                
            } else {
                throw new Exception("Hospital já foi cadastrado!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes!");
        }
        
    }

    public void delete(String id) throws Exception {
        dh.delete(id);
    }

    public void update(String cod, String name, String adress, String district, String city) throws Exception {
        h = new Hospital(cod, name, adress, district, city);
       
        String folder = "Hospital";
        File file = new File(folder, cod + ".data");
        
        if (!checkFields(cod, name, adress, district, city)) {
            if (file.exists()) {
                dh.update(h);                
            } else {
                throw new Exception("Hospital não foi cadastrado!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes!");
        }
    }
    
    public Hospital search(String id) {
        return (Hospital) dh.search(id);
    }

    private boolean checkFields(String cod, String name, String adress, String district, String city) {
        return cod.length() <= 0 || name.length() <= 0 || adress.length() <= 0
                || district.length() <= 0 || city.length() <= 0;
    }
}
