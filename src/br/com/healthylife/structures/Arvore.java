package br.com.healthylife.structures;

import br.com.healthylife.entity.Client;
import br.com.healthylife.entity.Entity;
import javax.swing.table.DefaultTableModel;

public class Arvore<J extends Entity> {

    private Nodo raiz;
    private Arvore arvoreEsquerda;
    private Arvore arvoreDireita;
        
    public Arvore() {
        
    }

    public Arvore getArvoreDireita() {
        return arvoreDireita;
    }

    public void setArvoreDireita(Arvore arvoreDireita) {
        this.arvoreDireita = arvoreDireita;
    }

    public Arvore getArvoreEsquerda() {
        return arvoreEsquerda;
    }

    public void setArvoreEsquerda(Arvore arvoreEsquerda) {
        this.arvoreEsquerda = arvoreEsquerda;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void insere(Entity e) {
        Nodo no = new Nodo(e);
        inserir(no);
    }

    public void inserir(Nodo no) {
        if (this.raiz == null) {
            this.raiz = no;
        } else {
            Client c = (Client) no.getP();
            
            
            double valueNo = c.getID().charAt(0);
            double valueRaiz = c.getID().charAt(0);
            
            if (valueNo > valueRaiz) {
                if (this.arvoreDireita == null) {
                    this.arvoreDireita = new Arvore();
                }
                this.arvoreDireita.inserir(no);
            } else if (valueNo < valueRaiz) {
                if (this.arvoreEsquerda == null) {
                    this.arvoreEsquerda = new Arvore();
                }
                this.arvoreEsquerda.inserir(no);
            }
        }
    }

    public void percorrerInOrder(javax.swing.JTable jTable) {
        if (this.raiz == null) {
            return;
        }

        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerInOrder(jTable);
        }

        
        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerInOrder(jTable);
        }

        Client c = (Client) raiz.getP();

                DefaultTableModel consultList = (DefaultTableModel) jTable.getModel();

                consultList.addRow(new String[]{
                    c.getName(), c.getCPF(), String.valueOf(c.getAge()), c.getPhoneNumber(),
                    c.getEmail(), c.getPassword()
                });
        //System.out.println(this.raiz.getP().getID());
    }

    public void percorrerPreOrder() {
        if (this.raiz == null) {
            return;
        }

        Client c = (Client) raiz.getP();
        
        System.out.println(c.getID());
        System.out.println(c.getName());

        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerPreOrder();
        }

        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerPreOrder();
        }
    }

    public void percorrerPostOrder() {
        if (this.raiz == null) {
            return;
        }

        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerPostOrder();
        }

        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerPostOrder();
        }
        
        Client c = (Client) raiz.getP();
        
        System.out.println(c.getID());
        System.out.println(c.getName());
    }

    public Entity busca(String CPF) {

        Client c = (Client) raiz.getP();
        
        double valueCPF = CPF.charAt(0);
        double valueRaiz = c.getID().charAt(0);
        if (this.raiz == null) {
            return null;
        } else if (CPF.equals(c.getID())) {
            return (Client) this.raiz.getP();
        } else if (valueCPF > valueRaiz) {
            if (this.arvoreDireita == null) {
                return null;
            }
            return this.arvoreDireita.busca(CPF);
        } else {
            if (this.arvoreEsquerda == null) {
                return null;
            }
            return this.arvoreEsquerda.busca(CPF);
        }
    }
}