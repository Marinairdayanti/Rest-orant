/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author zainuri
 */
public class koneksis {
   private static Connection koneksi;
    public static Connection getKoneksi()
    {
        if(koneksi== null)
        {
            try {
                String url="jdbc:mysql://localhost/db_restaurant";
                String username= "root";     // default username
                String password= "";         // jika ada password bisa anda masukkan
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi =DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return koneksi;
    } 
}
