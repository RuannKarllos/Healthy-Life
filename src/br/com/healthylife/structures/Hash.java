
package br.com.healthylife.structures;

import br.com.healthylife.entity.Entity;
import javax.swing.JTable;


public class Hash {
    
    
    ListaLigada array [];

    public Hash() {
        
        array = new ListaLigada[50];
        startList();   
    }
    
    final void startList(){
        
        for (int i = 0; i < array.length; i++) {
            
            array[i]=new ListaLigada();
        } 
        
        
    }
    
public void addHash(Entity e){    
    
   array[funcaoHash(e)].adicionaNoComeco(e);
  
}   



final int funcaoHash(Entity e){
  
  int posicao = e.getID().charAt(0);
    
    
      return 7;
    }        
    
public void imprimir(javax.swing.JTable jTable) throws Exception{

  
array[7].printListHash(jTable);


}
}
