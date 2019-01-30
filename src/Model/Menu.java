/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Marina Ir
 */
public class Menu {

    //Attributes
    private int idMenu;
    private String nameMenu;
    private int hargaMenu;

    //Methods
    public Menu(int idMenu, String name, int harga){
        this.idMenu=idMenu;
        this.nameMenu=name;
        this.hargaMenu=harga;
    }

    public Menu() {
       
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }
    
    public String getNameMenu() {
        return nameMenu;
    }
    
    public void setNameMenu(String nameMenu) {
        this.nameMenu = nameMenu;
    }
  
    public void setHarga(int harga) {
        this.hargaMenu = harga;
    }
     
    public int getHarga() {
        return hargaMenu;
    }

     public void viewMenu() {
        System.out.println("Harga : "+this.hargaMenu);
    }

    String getMenu(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getHarga(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
