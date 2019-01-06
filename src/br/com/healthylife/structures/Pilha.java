package br.com.healthylife.structures;

import br.com.healthylife.entity.Client;
import br.com.healthylife.entity.Entity;
import javax.swing.table.DefaultTableModel;

public class Pilha {

    public Pilha(int n) {
        e = new Entity[n];
    }

    private int n;
    private Entity[] e;
    private int topo = -1;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Entity[] getE() {
        return e;
    }

    public void setE(Entity[] e) {
        this.e = e;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public boolean pilhaVazia() {
        return (topo == -1);
    }

    public boolean pilhaCheia() {
        return (topo == e.length - 1);
    }

    public void empilhar(Entity e) {
        if (pilhaCheia()) {
            System.out.println("Pilha Cheia!");
        } else {
            topo++;
            this.e[topo] = e;
            
        }
    }

    public void desempilhar() {
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia!");
        } else {
            this.e[topo] = null;
            topo--;
            System.out.println("Removido com Sucesso!");
        }
    }

    public void printList(javax.swing.JTable jTable) {
        if (pilhaVazia()) {
            //TODO
        } else {
            for (int i = 0; i < e.length; i++) {

                Client c = (Client) e[i];

                DefaultTableModel consultList = (DefaultTableModel) jTable.getModel();

                consultList.addRow(new String[]{
                    c.getName(), c.getCPF(), String.valueOf(c.getAge()), c.getPhoneNumber(),
                    c.getEmail(), c.getPassword()
                });

            }
        }
    }
}
