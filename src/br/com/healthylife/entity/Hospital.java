/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.entity;

import java.io.Serializable;

/**
 *
 * @author ruann
 */
public class Hospital extends Entity implements Serializable {

    private String cod;
    private String name;
    private String adress;
    private String district;
    private String city;
    
    public Hospital(String cod, String name, String adress, String district, String city) {
        this.cod = cod;
        this.name = name;
        this.adress = adress;
        this.district = district;
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getID() {
        return cod;
    }
}
