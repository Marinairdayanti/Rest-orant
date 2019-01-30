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
public class Transaksi {
    
    //Attributes
    private String idTransaksi;
    private int totalTransaksi;
    private int tanggal;
    private int[] jmlOrder;
    private Employee[] employee = new Employee[20];
    
    //Methods
    public Transaksi(String idTransaksi, int totalTransaksi, int tanggal, int[] jmlOrder){
        this.idTransaksi=idTransaksi;
        this.totalTransaksi=totalTransaksi;
        this.tanggal=tanggal;
        this.jmlOrder=jmlOrder;
    }
   
    public String getIdTransaksi() {
        return idTransaksi;
    }
    
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
    public int getTotalTransaksi() {
        return totalTransaksi;
    }
   
    public void setTotalTransaksi(int totalTransaksi) {
        this.totalTransaksi = totalTransaksi;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
    public void addEmployee(Employee e) {
        this.employee[totalTransaksi] = e;
        this.totalTransaksi++;
    }
    
    public Employee[] getEmployee(){
        return this.employee;
    }
    
    public int[] getJmlOrder() {
        return jmlOrder;
    }

    public void setJmlOrder(int[] jmlOrder) {
        this.jmlOrder = jmlOrder;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }
    
    public void countTransaksi(int i){
        this.getJmlOrder()[totalTransaksi] = i;
        this.totalTransaksi++;
    }
    
    public void viewTransaksi(){
     System.out.println("tanggal : "+this.tanggal);
     System.out.println("Total Transaksi : "+this.totalTransaksi);
    }

}
