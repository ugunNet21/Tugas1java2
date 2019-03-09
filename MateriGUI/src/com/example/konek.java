/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class konek {
    static  Connection koneksi;
    public static Connection getConnection(){
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/data_mhs","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "koneksi database gagal");
        }
        return koneksi;
    }
    
}
