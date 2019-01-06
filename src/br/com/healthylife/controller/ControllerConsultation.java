/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Consultation;
import br.com.healthylife.util.Factory;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ruann
 */
public class ControllerConsultation {

    IDao<Consultation> dc = Factory.getDao(Consultation.class);

    public void registerConsult(String patientName, String hospitalName, Date consultationDate) throws Exception {
        Consultation c = new Consultation(patientName, hospitalName, consultationDate);

        String folder = "Consultation";
        File file = new File(folder, patientName + ".data");
        
        if (!checkFields(patientName, hospitalName, consultationDate)) {
            if (!file.exists()) {
                dc.insert(c);
            } else {
                throw new Exception("Consulta já marcada!");
            }
        } else {
            throw new NullPointerException("Preencha todos os campos!");
        }
    }

    public void updateConsult(String patientName, String hospitalName, Date consultationDate) throws Exception {
        Consultation c = new Consultation(patientName, hospitalName, consultationDate);

        String folder = "Consultation";
        File file = new File(folder, patientName + ".data");
        
        if (checkFields(patientName, hospitalName, consultationDate)) {
            if (file.exists()) {
                dc.update(c);
            } else {
                throw new Exception("Consulta não marcada!");
            }
        } else {
            throw new NullPointerException("Preencha todos os campos!");
        }
    }

    public Consultation search(String id) {
        return (Consultation) dc.search(id);
    }
    
    public void cancelColsunt(String id) throws Exception {
        dc.delete(id);
    }
    
    public void doneConsult(String id) {
        
    }

    private boolean checkFields(String patientName, String hospitalName, Date consultationDate) {
        return patientName.length() <= 0 || hospitalName.length() <= 0 || String.valueOf(consultationDate).length() <= 0;
    }
}
