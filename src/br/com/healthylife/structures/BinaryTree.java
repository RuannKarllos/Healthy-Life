package br.com.healthylife.structures;

import br.com.healthylife.entity.Client;
import br.com.healthylife.entity.Entity;
import br.com.healthylife.entity.Medic;
import javax.swing.table.DefaultTableModel;

public class BinaryTree {

    private Node root;

    public BinaryTree(int n) {

    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getAltura() {
        return getAltura(this.root);
    }

    private int getAltura(Node root) {
        if (root == null) {
            return 0;
        }
        int altEsq = getAltura(root.getNoEsquerda());
        int altDir = getAltura(root.getNoDireita());
        if (altEsq > altDir) {
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }

    public int getQtdNode() {
        return getQtdNode(root);
    }

    private int getQtdNode(Node root) {
        if (root == null) {
            return 0;
        }
        int qtdNodeEsq = getQtdNode(root.getNoEsquerda());
        int qtdNodeDireita = getQtdNode(root.getNoDireita());
        return qtdNodeEsq + qtdNodeDireita + 1;
    }

    public void imprimirArvore(javax.swing.JTable jTable) {
        if (this.root == null) {
            throw new NullPointerException("Ocorreu um erro interno ao exibir, tente novamente!");
        } else {
            imprimirArvore(this.root, jTable);
        }
    }

    private void imprimirArvore(Node node, javax.swing.JTable jTable) {
        DefaultTableModel listM = (DefaultTableModel) jTable.getModel();
        
        if (node.getNoEsquerda() != null) {
            imprimirArvore(node.getNoEsquerda(), jTable);
        }
        if (node.getNoDireita() != null) {
            imprimirArvore(node.getNoDireita(), jTable);
        }
        
        Medic m = (Medic) node.getE();
        
        listM.addRow(new String[]{
            m.getID(), m.getName(), m.getCPF(), String.valueOf(m.getAge()), m.getPassword()
        });

        // }
    }

    public void inserir(Entity e) {
        inserir(this.root, e);
    }

    public void inserir(Node node, Entity e) {
        if (this.root == null) {
            this.root = new Node(e);
        } else {
            
            double valorMedic = Double.parseDouble(e.getID());
            double valorNode = Double.parseDouble(node.getE().getID());

            if (valorMedic < valorNode) {
                if (node.getNoEsquerda() != null) {
                    inserir(node.getNoEsquerda(), e);
                } else {

                    node.setNoEsquerda(new Node(e));
                }

            } else if (valorMedic > valorNode) {

                if (node.getNoDireita() != null) {
                    inserir(node.getNoDireita(), e);
                } else {

                    node.setNoDireita(new Node(e));
                }
            }
        }
    }

    public Node remover(Entity e) throws Exception {
        return remover(this.root, e);
    }

    private Node remover(Node node, Entity e) throws Exception {
        if (this.root == null) {
            throw new Exception("Árvore vazia");
        } else {
            Medic m = (Medic) node.getE();

            double valorMedic = m.getCrm();
            double valorNode = Double.parseDouble(node.getE().getID());

            if (valorMedic < valorNode) {
                node.setNoEsquerda(remover(node.getNoEsquerda(), e));
            } else if (valorMedic > valorNode) {
                node.setNoDireita(remover(node.getNoDireita(), e));
            } else if (node.getNoEsquerda() != null && node.getNoDireita() != null) {
                /*2 filhos*/
                System.out.println("  Removeu No " + node.getE().getID());
                node.setEntity(encontraMinimo(node.getNoDireita()).getE());
                node.setNoDireita(removeMinimo(node.getNoDireita()));
            } else {
                System.out.println("  Removeu No " + node.getE().getID());
                node = (node.getNoEsquerda() != null) ? node.getNoEsquerda() : node.getNoDireita();
            }
            return node;
        }
    }

    private Node removeMinimo(Node node) {
        if (node == null) {
            System.out.println("  ERRO ");
        } else if (node.getNoEsquerda() != null) {
            node.setNoEsquerda(removeMinimo(node.getNoEsquerda()));
            return node;
        } else {
            return node.getNoDireita();
        }
        return null;
    }

    private Node encontraMinimo(Node node) {
        if (node != null) {
            while (node.getNoEsquerda() != null) {
                node = node.getNoEsquerda();
            }
        }
        return node;
    }

}
