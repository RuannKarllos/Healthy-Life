package br.com.healthylife.dao;

import br.com.healthylife.structures.ListaLigada;
import br.com.healthylife.entity.Entity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Dao< J extends Entity> implements IDao<J> {

    private Class currentClass;

    //ListaLigada lista = new ListaLigada();
    public Dao(Class<J> currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    public void insert(J e) {
        save(e);
    }

    @Override
    public void delete(String id) throws Exception {
        //lista.removerDoComeco();
        File folder = getFolder();
        File file = new File(folder, id + ".data");

        if (!file.exists()) {
            throw new Exception("O arquivo desejado não existe!");
        } else {
            file.delete();
        }
    }

    @Override
    public void update(J e) {
        //lista.adicionaNoComeco(e);
        save(e);
    }

    @Override
    public J search(String id) {

        J entity = null;
        File folder = getFolder();

        File file = new File(folder, id);

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            entity = (J) ois.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            //TODO 
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    //TODO
                }
            }
        }

        return entity;
    }

    @Override
    public J[] listen() {
        J e[] = null;
        return e;
    }

    public void save(J e) {

        File folder = getFolder();
        File file = new File(folder, e.getID() + ".data");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(e);

        } catch (Exception ex) {
            //TODO
        } finally {
            if (oos != null) {
                try {

                    oos.close();

                } catch (IOException ex) {
                    //TODO
                }
            }
        }
    }

    private File getFolder() {
        String getClassName = currentClass.getSimpleName();

        File file = new File(getClassName);

        file.mkdirs();

        return file;
    }

}
