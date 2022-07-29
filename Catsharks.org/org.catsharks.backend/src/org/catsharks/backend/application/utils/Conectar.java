package org.catsharks.backend.application.utils;

import org.catsharks.frontend.gui.MyFrame;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Crea una conexión con nuestra base de datos MySQL.
 */
public class Conectar {
    /**
     * Ruta a la base de datos relacional.
     */
    private static final String URL = "jdbc:mysql://localhost:3306/catsharks";
    /**
     * Usuario encargado de hacer las consultas a la base de datos.
     */
    private static final String USER = "ncq_java";
    /**
     * Credenciales del usuario MySQL.
     */
    private static final String CLAVE = "1234";
    /**
     * Mensaje de error para el usuario en caso de problemas con la conexión.
     */
    private static final String ERROR_MSG = "Error: ";
    /**
     * Método que crea una conexión con una base de datos relacional.
     */
    public Connection getConexion(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println(ERROR_MSG + e.getMessage());
            MyFrame.succes_lb.setVisible(false);
        }
        return con;
    }
}
