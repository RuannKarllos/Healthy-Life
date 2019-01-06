/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.util;

import br.com.healthylife.dao.Dao;
import br.com.healthylife.entity.Entity;

/**
 *
 * @author aluno
 */
public class Factory {
    public static <J extends Entity> Dao<J> getDao(Class myClass) {
        return new Dao<J>(myClass);
    }
}
