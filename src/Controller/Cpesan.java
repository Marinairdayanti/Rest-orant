/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.Pesan;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Marina Ir
 */
public class Cpesan extends MouseAdapter implements ActionListener {
    
    //Attributes
    private Pesan view;
    private Databases db;
    Menu menu = new Menu();

    //Methods
    public Cpesan() {
        view = new Pesan();
//        db = new Databases();
        view.addActionListener((ActionListener) this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.setDate();
    }

    public void loadTable(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "Nama Menu", "Harga", "Jumlah Order"}, 0);
        ArrayList<Order> order = db.getOrder();
        for (Order o : order) {
            model.addRow(new Object[]{o.getMenu(), o.getJumOrder(), o.getMenu()});
        }
        view.setTbl(model);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnCheckOut())) {
            
            view.dispose();
            new Ccheckout();
            
        }
        
    }
    
    public void addActionPerformed(){
        String namaMenu = view.getNamaMenu();
        String harga = view.getHarga();
        String jumOrder = String.valueOf(view.getJumlahOrder());
        if (namaMenu.isEmpty() || harga.isEmpty() || jumOrder.isEmpty()){
            view.showMessage("Data Kosong", "Error", 0);
            
        } else {
            db.addOrder (new Order (namaMenu, Integer.parseInt(harga), Integer.parseInt(jumOrder) ) );
            view.reset();
            view.showMessage("Data Berhasil Ditambah", "Success", 1);
        }
        
    }

    private void batalActionPerformed() {
        String id_Order = null;
        db.delOrder(id_Order);
        view.reset();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
    }

    private void transaksiActionPerformed() {
        String namaMenu = view.getNamaMenu();
        String harga = view.getHarga();
        String jumOrder = String.valueOf(view.getJumlahOrder());
        if (namaMenu.isEmpty() || harga.isEmpty() || jumOrder.isEmpty()){
            view.showMessage("Data Kosong", "Error", 0);
            
        } else {
                db.addOrder(new Order(namaMenu, Integer.parseInt(harga), Integer.parseInt(jumOrder)));
                view.reset();
                view.showMessage("Data Berhasil Diubah", "Success", 1);
        }
    }
    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.gettbl())){
            int i = view.getSelectedOrder();
            String namaMenu = view.gettbl().getModel().getValueAt(i, 0).toString();
            int harga = (int) view.gettbl().getModel().getValueAt(i, 1);
            int jumlahOrder = (int) view.gettbl().getModel().getValueAt(i, 2);
            
            view.setNamaMenu(namaMenu);
            view.setHarga(harga);
            view.setJumlahOrder(jumlahOrder);
            
        }
    }

    
    
}
