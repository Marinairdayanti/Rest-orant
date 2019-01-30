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
public class Employee extends Person{
    
    //Attributes
    private String idEmployee;
    
    //Methods
    public Employee(String idEmployee, String nama){
        super(nama);
        this.idEmployee=idEmployee;
    }

    public void modifyInfo() {
       
    }
     
    public void TakeOrder() {
         
    }
    
}
