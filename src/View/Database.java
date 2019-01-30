/*
 * Database.java
 *
 * Created on July 2, 2009, 7:58 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package View;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;
/**
 *
 * @author dharma
 */
public class Database {
public Properties mypanel, myLanguage;
private String strNamaPanel;    

    /** Creates a new instance of Database */
    public Database() {

    }
    
    public String SettingPanel(String nmPanel){
        try{
            mypanel=new Properties();
            mypanel.load(new FileInputStream("lib/database.ini"));
            strNamaPanel=mypanel.getProperty(nmPanel);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Tidak Ada Koneksi","Error",JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return strNamaPanel;
    }
    
}
