/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.SystemColor;

/**
 *
 * @author Marina Ir
 */
public class Order {
    
    //Attributes
    private int id_Order;
    private int jumOrder;
    private int noTable=0;
    private Menu menu;
    private Transaksi transaksi;
    private Table[] table = new Table[20];
    private User[] user = new User[20];

    //Methods
    public Order(int id_Order, int jumOrder, int noTable, Transaksi transaksi){
       this.id_Order=id_Order;
       this.jumOrder=jumOrder;
       this.noTable= noTable;
       this.transaksi=transaksi;
    }

    public Order(String namaMenu, int harga, int jumOrder) {
       
    }
    
    public Order(int jumOrder, int harga) {
       
    }

    public int getId_Order() {
        return id_Order;
    }

    public int getJumOrder() {
        return jumOrder;
    }

    public int getNoTable() {
        return noTable;
    }

    public Menu getMenu(){
        menu.getHarga();
        return menu;
    }

    String getTotalBayar() {
       return null;
    }
    
    public void addMenu(Menu menu) {
        this.menu=menu;
    }
    
    public void addTable(Table t) {
        this.table[noTable] = t;
        this.noTable++;
     }
    
    public Table[] getTable(){
        return this.table;
    }
    
    public void addUser(User u) {
        this.user[id_Order] = u;
        this.id_Order++;
    }

    public User[] getUser(){
        return this.user;
    }

    String addMenu(SystemColor menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
