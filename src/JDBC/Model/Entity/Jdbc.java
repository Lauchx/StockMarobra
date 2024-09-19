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
    String insertStmt = "INSERT INTO Product(name) VALUES(?);";

    public void ConnectionSQL(Product product) {
        try {
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Marobra;user=userMarobra;password=root");
            System.out.println("Conectado");

            System.out.println("Agregar un producto");

            PreparedStatement pstmt = cn.prepareStatement(insertStmt, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, product.getName());
            pstmt.execute();
            //pstmt.executeBatch();

            ResultSet rs = pstmt.getGeneratedKeys(); // this id it´s in the position 1
            if (rs.next()) {
                product.setId(rs.getInt(1)); // set ID in the position 1
            }

            System.out.println("");
            System.out.println("Listamos Person");
            String sql = "SELECT id, name FROM Product;";

            Statement stmt = cn.createStatement();
            //stmt.execute(sql);
            stmt.executeQuery(sql);
            rs = stmt.getResultSet();
            

        } catch (SQLException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cn != null) {
                cn = null;
            }
        }
    }

}
