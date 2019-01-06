package br.com.healthylife.structures;

import br.com.healthylife.entity.Employee;
import br.com.healthylife.entity.Person;
import br.com.healthylife.entity.Entity;
import br.com.healthylife.entity.Hospital;
import javax.swing.table.DefaultTableModel;

public class ListaLigada {

    private Nodo primeiro;

    private Nodo ultimo;

    private int totalElementos;

    public void adicionaNoComeco(Entity e) {

        Nodo novo = new Nodo(this.primeiro, e);
        this.primeiro = novo;

        if (this.totalElementos == 0) {

            this.ultimo = this.primeiro; 
        }

        totalElementos++;
    }

    public void adicionaNoFim(Entity e) {

        if (this.totalElementos == 0) {

            this.adicionaNoComeco(e);

        } else {

            Nodo novo = new Nodo(e);

            this.ultimo.setProximo(novo);

            this.ultimo = novo;

            this.totalElementos++;

        }
    }

    private boolean posicaoOcupada(int posicao) {

        return posicao >= 0 && posicao < this.totalElementos;
    }

    private Nodo pegaNodo(int posicao) {

        if (!this.posicaoOcupada(posicao)) {

            throw new IllegalArgumentException("posicao nao existe");

        }

        Nodo atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();

        }
        return atual;

    }

    public void adicionarQualquerPosicao(int posicao, Person person) {

        if (posicao == 0) {
            this.adicionaNoComeco(person);

        } else if (posicao == totalElementos) {

            this.adicionaNoFim(person);

        } else {

            Nodo anterior = this.pegaNodo(posicao - 1);
            Nodo novo = new Nodo(anterior.getProximo(), person);
            anterior.setProximo(novo);
            this.totalElementos++;

        }
    }

    public Object pega(int posicao) {

        return this.pegaNodo(posicao).getP();
    }

    public void removerDoComeco() {

        if (!this.posicaoOcupada(0)) {

            throw new IllegalArgumentException("Posição nao existe");

        }
        this.primeiro = this.primeiro.getProximo();
        this.totalElementos--;

        if (this.totalElementos == 0) {

            this.ultimo = null;
        }

    }

    public int tamanho() {
        return this.totalElementos;

    }

    public void printList(javax.swing.JTable jTable) {
        Nodo atual = primeiro;

        if (this.totalElementos == 0) {
            //TODO
        } else {
            for (int i = 0; i < totalElementos; i++) {
                Employee e = (Employee) atual.getP();

                DefaultTableModel employeeList = (DefaultTableModel) jTable.getModel();

                employeeList.addRow(new String[]{
                    e.getName(), e.getCPF(), String.valueOf(e.getAge()), e.getPhoneNumber(), e.getPassword()
                });

                atual = atual.getProximo();
            }
        }

    }

    public void printListHash(javax.swing.JTable jTable) throws Exception {
        Nodo atual = primeiro;
        if (this.totalElementos == 0) {
            throw new Exception("Ocorreu um erro interno!");
        } else {
            for (int i = 0; i < totalElementos; i++) {
                Hospital h = (Hospital) atual.getP();

                DefaultTableModel hTable = (DefaultTableModel) jTable.getModel();

                hTable.addRow(new String[]{
                    h.getID(), h.getName(), h.getCity(), h.getDistrict()
                });
            }
        }
    }
}
