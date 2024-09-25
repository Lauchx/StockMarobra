/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC.Model.Entity;

import Products.Model.Entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import stockmarobra.Program;

/**
 *
 * @author retam
 */
public class Jdbc {

    Connection cn = null;
    String insertStmtProduct = "INSERT INTO Products(name, categoryName, stock_id, ancho, alto, profundidad) VALUES(?,?,?,?,?,?);";
    String insertStmtStock = "INSERT INTO Stock(currentQuantity) VALUES(?);";

    public void ConnectionSQL(Product product) {
        try {
            //cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Marobra;user=userMarobra;password=root");
            cn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/prueba?user=root&password=root");
            System.out.println("Conectado");
            System.out.println("Agregar un producto");

            PreparedStatement pstmtStock = cn.prepareStatement(insertStmtStock, Statement.RETURN_GENERATED_KEYS);
            pstmtStock.setInt(1, product.getStock().getCurrentQuantity());
            pstmtStock.executeUpdate();
            
               ResultSet rsStock = pstmtStock.getGeneratedKeys(); // this id begin in the position 1
               int stock_id = 0;
            if (rsStock.next()) {
                stock_id = rsStock.getInt(1);
            }
            
            PreparedStatement pstmtProduct = cn.prepareStatement(insertStmtProduct, Statement.RETURN_GENERATED_KEYS);
            pstmtProduct.setString(1, product.getName());
            pstmtProduct.setString(2, product.getCategory());
            pstmtProduct.setInt(3, stock_id);   
            pstmtProduct.setInt(4, product.getWidth());
            pstmtProduct.setInt(5, product.getHeight());
            pstmtProduct.setInt(6, product.getDepth());
            pstmtProduct.executeUpdate();
            System.out.println("producto agregado");
            
            
            // SE GUARDAN LOS PRODUCTOS VAMOOOOO
//            System.out.println("");
//            System.out.println("Listamos Person");
//            String sql = "SELECT id, name FROM Product;";
//
//            Statement stmt = cn.createStatement();
//            //stmt.execute(sql);
//            stmt.executeQuery(sql);
//            rs = stmt.getResultSet();

        } catch (SQLException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cn != null) {
                cn = null;
            }
        }
    }

}
