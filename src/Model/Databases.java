/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.awt.SystemColor.menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marina Ir
 */
public class Databases {
    
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Order> order = new ArrayList<>();


    public Databases() {
        loadOrder();
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/resto";
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Databases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Databases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Databases.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadOrder() {
        connect();
        try {
            String query = "SELECT * FROM order";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                int amount = Integer.parseInt(rs.getString("amountFood"));
                int price = Integer.parseInt(rs.getString("priceFood"));
                order.add(new Order(amount, price) );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Databases.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Order> getOrder() {
        return order;
    }
    
    public void addOrder(Order o) {
        connect();
        String query = "INSERT INTO order VALUES (";
        query += "'" + o.getMenu() + "',";
        query += "'" + o.addMenu(menu)+ "',";
        query += "'" + o.getJumOrder()+ "',";
        query += ")";
        if (manipulate(query)) order.add(o);
        disconnect();
    }
     
    
    public void delOrder(String id_Order) {
        connect();
        String query = "DELETE FROM order WHERE id_Order='" + id_Order + "'";
        if (manipulate(query)){
            for (Order o : order) {
                if (id_Order.equals(o.getId_Order())){
                    order.remove(o);
                    break;
                } else {
                    
                }
            }
        }
        disconnect();
    }
    
    
}
