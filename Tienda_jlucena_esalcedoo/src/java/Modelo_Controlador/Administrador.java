/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo_Controlador;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author elena
 */
public class Administrador {
    
    private Connection conn;

    public Administrador(DataSource ds) {
        try {
            conn = ds.getConnection();

        } catch (SQLException e) {
            throw new RuntimeException("Error en la base de datos",e);
        }
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
