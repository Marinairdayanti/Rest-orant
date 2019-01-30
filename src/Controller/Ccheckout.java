/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.awt.event.*;

/**
 *
 * @author LENOVO
 */
public class Ccheckout extends MouseAdapter implements ActionListener {
    
    //Attributes
    private CheckOut view;
    private Database db;
    
    //Methods
    public Ccheckout() {
        view = new CheckOut();
//        db = new Database();
        view.addActionListener((ActionListener) this);
        view.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnExit())) {
            
            view.dispose();
            System.exit(0);
        }
        
    }
    
}
