/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import ec.edu.ups.modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Conexion_db {
    Connection con;
    Statement sentencia;
    ResultSet resultado;

    String driver = "org.mysql.Driver"; // el nombre de nuestro driver Postgres.
    String connectString = "jdbc:mysql://localhost/citasmedicas" + "?userTimezone=true&serverTimezone=UTC"; // llamamos nuestra bd
    String user = "root"; // usuario postgres
    String password = "patito.123"; // no tiene password nuestra bd.

    public boolean EstableserConexion() {
        try {
            con = DriverManager.getConnection(connectString, user, password);
            System.out.println("conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            this.sentencia = (Statement) this.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Error al crear objeto de declaracion " + ex);
            return false;
        }
        return true;
    }
    
    
    public void InsertDatos(String sql) { 
        try {
            sentencia.execute(sql);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Conexion_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int codigo(String tabla){
        int codigo = 0;
        try {
            String sqlCont = "SELECT * FROM " + tabla + " ORDER BY 1";
            resultado = sentencia.executeQuery(sqlCont);
            while (resultado.next()) {
                codigo = resultado.getInt("codigo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        return codigo;
    }
    public void cerrarConexion() {
        try {
            con.close();
            sentencia.close();
            resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listado( Set<Paciente> lista) {
        try {
            String sqlCont = "SELECT * FROM paciente ORDER BY codigo";
            resultado = sentencia.executeQuery(sqlCont);
            while (resultado.next()) {
                Paciente paciente=new Paciente(
                        resultado.getString("sintomas"), 
                        resultado.getInt("codigo"), 
                        resultado.getString("cedula"), 
                        resultado.getString("nombre"), 
                        resultado.getString("telefono"),
                        resultado.getString("direccion"));
                lista.add(paciente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public Paciente buscarPas(int codigo) {
        try {
            String sqlCont = "SELECT * FROM paciente where codigo="+codigo;
            resultado = sentencia.executeQuery(sqlCont);
            while (resultado.next()) {
                Paciente paciente=new Paciente(
                        resultado.getString("sintomas"), 
                        resultado.getInt("codigo"), 
                        resultado.getString("cedula"), 
                        resultado.getString("nombre"), 
                        resultado.getString("telefono"),
                        resultado.getString("direccion"));
                return paciente;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
}
