package br.com.healthylife.structures;

import br.com.healthylife.entity.Entity;

public class Node<J extends Entity> {

    private Entity e;

    private Node noEsquerda;

    private Node noDireita;

    public Node() {
    }

    public Node(Entity e) {
        super();
        this.e = e;
    }

    public Entity getE() {
        return e;
    }

    public void setEntity(Entity e) {
        this.e = e;
    }

    public Node getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(Node noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public Node getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(Node noDireita) {
        this.noDireita = noDireita;
    }

    @Override
    public String toString() {

        return "Node [valor=" + e + "]";

    }
}
