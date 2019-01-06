
package br.com.healthylife.structures;

import br.com.healthylife.entity.Person;


public class DinamicList {
    
    Lista primeiro;
    Lista ultimo;
    int tamanho = 0;

    public DinamicList() {
        primeiro = null;
        ultimo = primeiro;
        
    }
    
   public void add(String  nome){ 
    
       if(primeiro == null){
           primeiro = new Lista();
           ultimo = primeiro;
           Lista novo = new Lista();
           novo.setName(nome);
           novo.setProx(null);
           ultimo.setProx(novo);
           ultimo = novo;
           tamanho++;
           
           
           
           
       }else{
    
           Lista novo = new Lista();
           novo.setName(nome);
           novo.setProx(null);
           ultimo.setProx(novo);
           ultimo = novo;
           tamanho++;
           
    
       }
   }
   
   
   public void imprimeLista(){
       
       Lista pecorrer = primeiro.getProx();
       
       while(pecorrer!=null){
  
           System.err.println(pecorrer.getName());
           pecorrer = pecorrer.getProx();
       
       
       }
   }

public void remover(String nome){

     Lista remover = primeiro.getProx();
     Lista sair = primeiro;
     
     if(!(primeiro == null)){  
       while(remover!=null){
           if(remover.getName().equalsIgnoreCase(nome)){
           if(remover.getProx()== null){   
              ultimo = sair;
              ultimo.setProx(null);
              remover=null;
              tamanho--;
              break;
               
           }else{
           
               sair.setProx(remover.getProx());
               remover.setProx(null);
               remover=null;
               tamanho--;
               break;
            } 
           
        }
    
    remover = remover.getProx();
    sair = sair.getProx();

}

     System.gc();
}
       
}
}
