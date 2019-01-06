/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author ruann
 */
public class Wallpaper extends JDesktopPane {
    
    private Image images;

    public Wallpaper(String images) {
        this.images = new ImageIcon(images).getImage();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        //Graphics gr = (Graphics2D)g.create();
        g.drawImage(images, 0, 0, getWidth(), getHeight(), this);
        //gr.dispose();
        
    }
    
    
//  Adicionar a classe/frame principal  
//  Wallpaper desktop;
//    
//    setLayout(new GridLayout());
//        
//        desktop = new Wallpaper("Images/logo.png");
//        getContentPane().add(desktop);
        
}
