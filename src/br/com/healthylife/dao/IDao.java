/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.dao;

import br.com.healthylife.entity.Entity;


public interface IDao<J extends Entity>{
    
    public void insert(J entity);
    
    public void delete(String id) throws Exception; 
    
    public void update(J entity);
    
    public J search(String id);
    
    J[] listen();
}
