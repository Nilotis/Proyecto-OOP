package org.catsharks.backend.application.utils;

import org.catsharks.backend.application.entities.Animal;
import org.catsharks.backend.application.entities.Fish;
import org.catsharks.backend.application.entities.Habitat;
import org.catsharks.frontend.gui.MyFrame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * Clase que implementa los metodos para generar consultas MySQL.
 */
public class ControlDatos {
    /**
     * Inyección SQL hacia la tabla animal.
     */
    private static final String INSERT_ANIMAL = "insert into animal(especie, habitat, sexo) values(?,?,?)";
    /**
     * Inyección SQL hacia la tabla bioma.
     */
    private static final String INSERT_BIOME = "insert into bioma(habitat, profundidad, tmp_navegacion, nubosidad, " +
            "direccion_viento, fuerza_viento, hora_llegada, num_embarcaciones, temperatura, tipo_cebo, parasitos," +
            " presencia_anzuelos, num_anzuelos) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    /**
     * Sentencia a mostrar en caso de error.
     */
    private static final String WARNING_MSG = "Error de conexión: ";
    /**
     * Instanciación de la clase conectar.
     */
    private final Conectar conectar;
    /**
     * Instanciación de la clase habitat.
     */
    private final Habitat habit;
    /**
     * Instanciación de la clase Fish.
     */
    private final Fish pez;
    /**
     * Constructor principal de la clase. Contiene
     * constructores de otras clases para poder crear las consultas.
     */
    public ControlDatos(){conectar = new Conectar();habit = new Habitat();pez = new Fish(Animal.FISH, true);}
    /**
     * Método que crear las consultas MySQL i las envia al servidor.
     * @param especie
     * @param sexo
     * @param habitat
     * @param profundidad
     * @param tmp_nav
     * @param nubosidad
     * @param direccio_viento
     * @param fuerza_viento
     * @param hora_llegada
     * @param num_embarcaciones
     * @param temp
     * @param tipo_cebo
     * @param parasitos
     * @param presencia_anzuelos
     * @param num_anzuelos
     */
    public void insertar(String especie,String sexo,String habitat,int profundidad,int tmp_nav,String nubosidad,
                         String direccio_viento,String fuerza_viento,String hora_llegada,int num_embarcaciones,int temp,
                         String tipo_cebo,int parasitos,int presencia_anzuelos, int num_anzuelos){
        PreparedStatement ps;
        String sql;
        String sql2;
        habit.setEspecie(especie);
        pez.setSex(sexo);

        PreparedStatement ps2;
        habit.setHabitat(habitat);
        habit.setProfundidad(profundidad);
        habit.setTmp_nav(tmp_nav);
        habit.setNubosidad(nubosidad);
        habit.setDireccio_viento(direccio_viento);
        habit.setFuerza_viento(fuerza_viento);
        habit.setHora_llegada(hora_llegada);
        habit.setNum_embarcaciones(num_embarcaciones);
        habit.setTemp(temp);
        habit.setTipo_cebo(tipo_cebo);
        habit.setParasitos(parasitos);
        habit.setPresencia_anzuelos(presencia_anzuelos);
        habit.setNum_anzuelos(num_anzuelos);
        try {
            Connection con = conectar.getConexion();
            sql = INSERT_ANIMAL;
            sql2 = INSERT_BIOME;
            ps = con.prepareStatement(sql);
            ps.setString(1, habit.getEspecie());
            ps.setString(2, habit.getHabitat());
            ps.setString(3, pez.getSex());

            ps2 = con.prepareStatement(sql2);
            ps2.setString(1, habit.getHabitat());
            ps2.setInt(2, habit.getProfundidad());
            ps2.setInt(3, habit.getTmp_nav());
            ps2.setString(4, habit.getNubosidad());
            ps2.setString(5, habit.getDireccio_viento());
            ps2.setString(6, habit.getFuerza_viento());
            ps2.setString(7, habit.getHora_llegada());
            ps2.setInt(8, habit.getNum_embarcaciones());
            ps2.setInt(9, habit.getTemp());
            ps2.setString(10, habit.getTipo_cebo());
            ps2.setInt(11, habit.getParasitos());
            ps2.setInt(12, habit.getPresencia_anzuelos());
            ps2.setInt(13, habit.getNum_anzuelos());
            ps2.executeUpdate();
            ps.executeUpdate();
        }
        catch(SQLException e){
            MyFrame.succes_lb.setVisible(false);
            MyFrame.warning_lb.setVisible(true);
            JOptionPane.showMessageDialog(null, WARNING_MSG + e.getMessage());
        }
    }
}