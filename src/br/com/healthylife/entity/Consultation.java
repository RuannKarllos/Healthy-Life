/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ruann
 */
public class Consultation extends Entity implements Serializable {

    private String patientName;
    private String hospitalName;
    private Date consultationDate;
 
    public Consultation(String patientName, String hospitalName, Date consultationDate) {
        this.patientName = patientName;
        this.hospitalName = hospitalName;
        this.consultationDate = consultationDate;       
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    @Override
    public String getID() {
        return patientName;
    }
}
