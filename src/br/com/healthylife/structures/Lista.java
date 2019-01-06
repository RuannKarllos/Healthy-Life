
package br.com.healthylife.structures;


public class Lista {
    
    Lista(){
    
    
    }
    private String name;
    private Lista prox;

    public String getName() {
        return name;
    }

    public Lista getProx() {
        return prox;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProx(Lista prox) {
        this.prox = prox;
    }
    
    
    
}
