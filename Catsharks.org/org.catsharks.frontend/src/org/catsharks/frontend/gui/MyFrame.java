package org.catsharks.frontend.gui;

import org.catsharks.backend.application.entities.Animal;
import org.catsharks.backend.application.entities.Fish;
import org.catsharks.backend.application.entities.Habitat;
import org.catsharks.backend.application.utils.Arithmetic;
import org.catsharks.backend.application.utils.ControlDatos;
import java.awt.*;
import java.util.Objects;
import javax.swing.*;
/**
 * Clase que implementa los metodos para instancia objetos tipo {@code MyFrame}.
 */
public class MyFrame extends JPanel {
    public static final String ICON_PATH = "../visual_resources/icon.png";
    public static final String BRAND_NAME = "Observadores del Mar";
    public static final String MSG_LB1 = "Especie";
    public static final String MSG_LB2 = "Hábitat";
    public static final String MSG_LB3 = "Profundidad";
    public static final String MSG_LB4 = "m.";
    public static final String MSG_LB5 = "PROSHARKS (Tiburones y rayas pelágicos)";
    public static final String MSG_LB6 = "*Tiempo de navegación";
    public static final String MSG_LB7 = "*Fuerza del viento";
    public static final String MSG_LB8 = "*Hora de llegada";
    public static final String MSG_LB9 = "*Nubosidad";
    public static final String MSG_LB11 = "*Dirección del viento";
    public static final String MSG_LB12 = "*Número de embarcaciones";
    public static final String MSG_LB13 = "Temperatura superficial";
    public static final String MSG_LB14 = "*Tipo de cebo";
    public static final String MSG_LB15 = "*Sexo";
    public static final String MSG_LB16 = "*Parásitos";
    public static final String MSG_LB17 = "*Presencia de anzuelos";
    public static final String MSG_LB18 = "*Número de anzuelos";
    public static final String MSG_LB19 = "ºC";
    public static final String MSG_LB20 = "hh:mm";
    public static final String MSG_LB21 = "Faltan campos por rellenar";
    public static final String MSG_LB22 = "Los datos se han cargador correctamente";
    public static final String MSG_LB23 = "Faltan campos por rellenar.";
    public static final String MSG_LB24 = "Sí";
    public static final String MSG_LB25 = "No";
    public static final String MSG_LB26 = "Publicar";
    private final JLabel jlabel1;private final JLabel jlabel2;private final JLabel jlabel3;private final JLabel jlabel4;
    private final JComboBox<String> jcombobox1;private final JComboBox<String> jcombobox2;private final JTextField jtextfield1;
    private final JLabel jlabel5;private final JRadioButton jradiobutton1;private final JRadioButton jradiobutton2;private final JLabel jlabel6;
    private final JTextField jtextfield2;private final JLabel jlabel7;private final JLabel jlabel8;private final JButton jbutton1;
    private final JTextField jtextfield3;private final JLabel jlabel9;private final JLabel jlabel10;private final JComboBox<String> jcombobox3;
    private final JComboBox<String> jcombobox4;private final JComboBox<String> jcombobox5;private final JLabel jlabel11;
    private final JTextField jtextfield4;private final JLabel jlabel12;private final JLabel jlabel13;private final JLabel jlabel14;
    private final JComboBox<String> jcombobox6;private final JTextField jtextfield5;private final JTextField jtextfield6;private final JComboBox<String> jcombobox7;
    private final JComboBox<String> jcombobox8;private final JTextField jtextfield7;private final JLabel jlabel15;private final JLabel jlabel16;
    private final JLabel jlabel17;private final JLabel jlabel18;private final JLabel jlabel19;private final JLabel jlabel20;
    public static JLabel warning_lb;public static JLabel succes_lb;private final ButtonGroup select = new ButtonGroup();public static JLabel missing_lb;
    private static final Color WHITE = new Color(255, 255, 255);private static final Color BLUE = new Color(89, 156, 206);
    private static final Color RED = new Color(176, 3, 3);private static final Color GREEN = new Color(51, 140, 30);
    private static final Color BLACK = new Color(0, 0, 0);private static final Font BOLD_FONT = new Font("Arial", Font.BOLD, 14);
    /**
     * Constructor que instancia un marco
     * grafico para alojar los componentes.
     */
    public MyFrame() {

        //Instanció los contructores.
        jlabel1 = new JLabel(MSG_LB1);jlabel1.setFont(BOLD_FONT);jlabel1.setForeground(BLUE);jlabel2 = new JLabel(MSG_LB2);
        jlabel2.setFont(BOLD_FONT);jlabel2.setForeground(BLUE);jlabel3 = new JLabel(MSG_LB3);jlabel3.setFont(BOLD_FONT);
        jlabel3.setForeground(BLUE);jlabel4 = new JLabel(MSG_LB4);jlabel4.setFont(BOLD_FONT);jlabel4.setForeground(BLUE);
        jlabel5 = new JLabel(MSG_LB5);jlabel5.setFont(BOLD_FONT);jlabel5.setForeground(BLUE);jlabel6 = new JLabel(MSG_LB6);
        jlabel6.setBackground(WHITE);jlabel6.setForeground(BLUE);jlabel7 = new JLabel(MSG_LB7);jlabel7.setForeground(BLUE);
        jlabel8 = new JLabel(MSG_LB8);jlabel8.setForeground(BLUE);jlabel9 = new JLabel(MSG_LB9);jlabel9.setForeground(BLUE);
        jlabel10 = new JLabel(MSG_LB11);jlabel10.setForeground(BLUE);jlabel11 = new JLabel(MSG_LB12);jlabel11.setForeground(BLUE);
        jlabel12 = new JLabel(MSG_LB13);jlabel12.setForeground(BLUE);jlabel13 = new JLabel(MSG_LB14);jlabel13.setForeground(BLUE);
        jlabel14 = new JLabel(MSG_LB15);jlabel14.setForeground(BLUE);jlabel15 = new JLabel(MSG_LB16);jlabel15.setForeground(BLUE);
        jlabel16 = new JLabel(MSG_LB17);jlabel16.setForeground(BLUE);jlabel17 = new JLabel(MSG_LB18);jlabel17.setForeground(BLUE);
        jlabel18 = new JLabel();jlabel18.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(ICON_PATH))));
        jlabel19 = new JLabel(MSG_LB19);jlabel19.setForeground(BLUE);jlabel20 = new JLabel(MSG_LB20);jlabel20.setForeground(BLUE);
        warning_lb = new JLabel(MSG_LB21);warning_lb.setForeground(RED);warning_lb.setVisible(false);succes_lb = new JLabel(MSG_LB22);
        succes_lb.setForeground(GREEN);succes_lb.setVisible(false);missing_lb  = new JLabel(MSG_LB23);missing_lb.setForeground(RED);
        missing_lb.setVisible(false);jcombobox1 = new JComboBox<>(Fish.FISH_SPECIES);jcombobox1.setSelectedIndex(-1);
        jcombobox2 = new JComboBox<>(Fish.FISH_BIOME);jcombobox2.setSelectedIndex(-1);jcombobox3 = new JComboBox<>(Habitat.WIND);
        jcombobox3.setSelectedIndex(-1);jcombobox4 = new JComboBox<>(Habitat.WHEATER);jcombobox4.setSelectedIndex(-1);
        jcombobox5 = new JComboBox<>(Habitat.CARDINALS);jcombobox5.setSelectedIndex(-1);jcombobox6 = new JComboBox<>(Animal.SEX_SELECTOR);
        jcombobox6.setSelectedIndex(-1);jcombobox7 = new JComboBox<>(Habitat.BOOL);jcombobox7.setSelectedIndex(-1);
        jcombobox8 = new JComboBox<>(Habitat.BOOL);jcombobox8.setSelectedIndex(-1);jradiobutton1 = new JRadioButton(MSG_LB24);
        jradiobutton1.setFont(BOLD_FONT);jradiobutton1.setBackground(WHITE);jradiobutton1.setFont(BOLD_FONT);jradiobutton1.setBackground(WHITE);
        select.add(jradiobutton1);jradiobutton2 = new JRadioButton(MSG_LB25);jradiobutton2.setBackground(WHITE);jradiobutton2.setFont(BOLD_FONT);
        jradiobutton2.setBackground(WHITE);select.add(jradiobutton2);jtextfield1 = new JTextField(5);jtextfield2 = new JTextField(5);
        jtextfield3 = new JTextField(5);jtextfield4 = new JTextField(5);jtextfield5 = new JTextField(5);
        jtextfield6 = new JTextField(5);jtextfield7 = new JTextField(5);jbutton1 = new JButton(MSG_LB26);

        setLayout(null);setBackground(WHITE);

        //Añado los componentes.
        add(jlabel1);add(jlabel2);add(jlabel3);add(jlabel4);add(jcombobox1);add(jcombobox2);add(jtextfield1);
        add(jlabel5);add(jradiobutton1);add(jradiobutton2);add(jlabel6);add(jtextfield2);add(jlabel7);add(jlabel8);
        add(jbutton1);add(jtextfield3);add(jlabel9);add(jlabel10);add(jcombobox3);add(jcombobox4);add(jcombobox5);
        add(jlabel11);add(jtextfield4);add(jlabel12);add(jlabel13);add(jlabel14);add(jcombobox6);add(jtextfield5);
        add(jtextfield6);add(jcombobox7);add(jcombobox8);add(jtextfield7);add(jlabel15);add(jlabel16);add(jlabel17);
        add(jlabel18);add(jlabel19);add(jlabel20);add(warning_lb);add(succes_lb);add(missing_lb);

        //Asignación de tamaños de los componentes.
        jlabel1.setBounds(20, 115, 150, 25);jlabel2.setBounds(195, 115, 150, 25);
        jlabel3.setBounds(20, 180, 150, 25);jlabel4.setBounds(90, 205, 150, 25);
        jlabel5.setBounds(20, 240, 400, 25);jlabel6.setBounds(20, 305, 200, 25);
        jlabel7.setBounds(20, 365, 150, 25);jlabel8.setBounds(20, 430, 250, 25);
        jlabel9.setBounds(295, 305, 150, 25);jlabel10.setBounds(295, 365, 150, 25);
        jlabel11.setBounds(295, 430, 300, 25);jlabel12.setBounds(20, 490, 160, 25);
        jlabel13.setBounds(200, 490, 100, 25);jlabel14.setBounds(385, 490, 100, 25);
        jlabel15.setBounds(20, 545, 150, 25);jlabel16.setBounds(200, 545, 150, 25);
        jlabel17.setBounds(385, 545, 150, 25);jlabel18.setBounds(245, 15, 150, 80);
        jlabel19.setBounds(173, 515, 24, 25);jlabel20.setBounds(225, 455, 50, 25);
        warning_lb.setBounds(20, 625, 300, 25);succes_lb.setBounds(20, 625, 300, 25);
        missing_lb.setBounds(20, 625, 300, 25);jradiobutton1.setBounds(20, 265, 45, 25);
        jradiobutton2.setBounds(65, 265, 100, 25);jcombobox1.setBounds(20, 140, 150, 25);
        jcombobox2.setBounds(195, 140, 150, 25);jcombobox3.setBounds(20, 390, 200, 25);
        jcombobox4.setBounds(295, 330, 240, 25);jcombobox5.setBounds(295, 390, 240, 25);
        jcombobox6.setBounds(385, 515, 150, 25);jcombobox7.setBounds(20, 570, 150, 25);
        jcombobox8.setBounds(200, 570, 150, 25);jtextfield1.setBounds(20, 205, 68, 25);
        jtextfield2.setBounds(20, 330, 200, 25);jtextfield3.setBounds(20, 455, 200, 25);
        jtextfield4.setBounds(295, 455, 240, 25);jtextfield5.setBounds(20, 515, 150, 25);
        jtextfield6.setBounds(200, 515, 150, 25);jtextfield7.setBounds(385, 570, 150, 25);
        jbutton1.setBounds(435, 625, 100, 25);

        //Afegim els listeners als components
        jcombobox8.addActionListener(ev -> {
            if (jcombobox8.getSelectedIndex() == 1) {
                jtextfield7.setEnabled(false);
                jtextfield7.setText("0");
                jtextfield7.setVisible(false);
                jlabel17.setVisible(false);
            } else {
                jlabel17.setVisible(true);
                jtextfield7.setVisible(true);
                jtextfield7.setEnabled(true);
                jtextfield7.setForeground(BLACK);
                jtextfield7.setText("");
            }});
        jradiobutton1.addActionListener(ev -> {int select1 = 0;});
        jradiobutton2.addActionListener(ev -> {int select1 = 1;});
        jbutton1.addActionListener(this::btnGuardarActionPerformed);}
    /**
     * Método que envia los datos validados recogidos de los campos.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        boolean save = false;
        String habitat = (String) jcombobox2.getSelectedItem();
        String aux_profundidad = jtextfield1.getText();
        int profundidad;
        if(Objects.equals(aux_profundidad,"")){
            profundidad = -1;
        }else{
            profundidad = Integer.parseInt(jtextfield1.getText());
        }
        boolean save0 = Arithmetic.valInt(profundidad,0, null);
        String aux_tmp_nav = jtextfield2.getText();
        int tmp_nav;
        if(Objects.equals(aux_tmp_nav,"")){
            tmp_nav = -1;
        }else{
            tmp_nav  = Integer.parseInt(jtextfield2.getText());
        }
        boolean save1 = Arithmetic.valInt(tmp_nav,0, null);
        String nubes = (String) jcombobox4.getSelectedItem();
        String cardinales = (String) jcombobox5.getSelectedItem();
        String viento = (String) jcombobox3.getSelectedItem();
        String hora_llegada = jtextfield3.getText();

        String aux_num_embarcaciones = jtextfield4.getText();
        int num_embarcaciones;
        if(Objects.equals(aux_num_embarcaciones,"")){
            num_embarcaciones = -1;
        }else{
            num_embarcaciones  = Integer.parseInt(jtextfield4.getText());
        }
        boolean save2 = Arithmetic.valInt(num_embarcaciones,0, null);

        String aux_temp = jtextfield5.getText();
        int temp;
        if(Objects.equals(aux_temp,"")){
            temp = -100;
        }else {
            temp  = Integer.parseInt(jtextfield5.getText());
        }
        boolean save3 = Arithmetic.valInt(temp,0, null);

        String cebo = jtextfield6.getText();
        int boole = jcombobox7.getSelectedIndex();
        int bole = jcombobox8.getSelectedIndex();

        String aux_num_anzuelos = jtextfield7.getText();
        int num_anzuelos;
        if(Objects.equals(aux_num_anzuelos,"")){
            num_anzuelos = -1;
        }else {
            num_anzuelos = Integer.parseInt(jtextfield7.getText());
        }
        boolean save4 = Arithmetic.valInt(num_anzuelos,0, null);

        String especie = (String) jcombobox1.getSelectedItem();
        String sexo = (String) jcombobox6.getSelectedItem();
        if (save0 && save1 && save2 && save3 && save4){
            save = true;
        }
        if (save) {
            ControlDatos control = new ControlDatos();
            control.insertar(especie,sexo,habitat,profundidad,tmp_nav,nubes,cardinales,viento,hora_llegada,num_embarcaciones,temp,cebo,bole,boole,num_anzuelos);
            missing_lb.setVisible(false);
            succes_lb.setVisible(true);
            warning_lb.setVisible(false);
        } else {
            missing_lb.setVisible(true);
            succes_lb.setVisible(false);
            warning_lb.setVisible(false);
        }
    }
}
