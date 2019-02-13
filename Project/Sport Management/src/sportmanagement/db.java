/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandre
 */
public class db {
public static Connection java_db(){
    try{
    Class.forName("org.sqlite.JDBC");    
    Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Leandre\\Desktop\\E\\Self made\\Sports Management System\\Database\\Sport.sqlite");
    return con;   
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
}    
}
