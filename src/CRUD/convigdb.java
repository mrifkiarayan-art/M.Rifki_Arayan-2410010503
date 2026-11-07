/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
    import java.sql.Connection;
    import java.sql.Driver;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLDataException;
    import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class convigdb {
    private String user="root";
    private String pass="root";
    private String urldb="jdbc:mysql://localhost/prakterpbo2";
    private Connection koneksi;
    
    public convigdb(){
        try {
            Driver dbDriver =new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(dbDriver);
            this.koneksi = DriverManager.getConnection(urldb,user,pass);
            System.out.print("database berhasil di koneksikan");
        }  catch (Exception e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
           
           
         
            
        
         }
        }
        
        }
    

