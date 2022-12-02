/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
 import java.sql.*;
/**
 *
 * @author clebe
 */
public class Conexao {
    /**
     * método que realiza conexão com o Banco de Dados.
     */
     public static Connection conectar(){
        Connection conexao;
        String driver  = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/financeiro?useTimezone=true&serverTimezone=UTC&useSSL=false";
        //
        String user = "root";
        String passWord = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, passWord);
            return conexao;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
        
    }
}
