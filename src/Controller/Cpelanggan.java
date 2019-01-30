/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.awt.event.*;
import sun.java2d.d3d.D3DRenderQueue;

/**
 *
 * @author LENOVO
 */
public class Cpelanggan extends MouseAdapter implements ActionListener {
    
    //Attributes
    private Pelanggan view;
    private Databases db;
    
    //Methods
    public Cpelanggan() {
        view = new Pelanggan();
//        db = new Database();
        view.addActionListener((ActionListener) this);
        view.setVisible(true);
    } 
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnNext())) {    
            
            view.dispose();
            new Cpesan();
             
        }
        
    }

    
}
