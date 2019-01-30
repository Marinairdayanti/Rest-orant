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
public class User extends Person{
    
    //Attributes
    private int noTelp;
    
    //Methods
    public User(String nama){
        super(nama);
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }
    
}
