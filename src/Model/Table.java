/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Marina Ir
 */
public class Table {
    
    //Attributes
    private int noTable;
    
    //Methods
    public Table(int noTable){
        this.noTable=noTable;
    }

    public int getNoTable() {
        return noTable;
    }

    public void modifyTable(Table t) {
         System.out.println("Meja nomor :"+this.noTable);
    }
    
}
