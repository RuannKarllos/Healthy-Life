package br.com.healthylife.structures;

import br.com.healthylife.entity.Consultation;
import br.com.healthylife.entity.Entity;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Fila<J extends Entity> {

    private int size;
    private int begin;
    private int end;
    private int total;

    private Entity e[];

    public Fila(int size) {
        begin = end = total = 0;
        this.size = size;
        e = new Entity[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Entity[] getE() {
        return e;
    }

    public void setP(Entity[] e) {
        this.e = e;
    }

    public boolean emptyQueue() {
        return total == 0;
    }

    public boolean fullQueue() {
        return total == size;
    }

    public void queue(Entity e) {
        if (fullQueue()) {
            System.out.println("Fila Cheia!");
        } else {
            this.e[end] = e;
            end++;
            total++;

            if (end >= size) {
                end = 0;
            }
        }
    }

    public void enqueue() {
        if (emptyQueue()) {
            System.out.println("Fila Vazia!");
        } else {
            this.e[begin] = null;
            begin++;
            total--;

            if (begin >= size) {
                begin = 0;
            }
        }
    }

    public void printList(javax.swing.JTable jTable1) {
        if (emptyQueue()) {
            System.out.println("Fila Vazia!");
        } else {
            int aux = begin;
            for (int i = 0; i < total; i++) {
                
                Consultation c = (Consultation) e[aux];

                DefaultTableModel consultList = (DefaultTableModel) jTable1.getModel();
                
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

                consultList.addRow(new String[]{
                    c.getPatientName(), c.getHospitalName(), format.format(c.getConsultationDate())
                });
                
                aux++;

                if (aux >= size) {
                    aux = 0;
                }
            }
        }
    }

    public void printFrist() {
        if (emptyQueue()) {
            System.out.println("Fila Vazia!");
        } else {
            System.out.println(e[begin].getID());
        }
    }
}
