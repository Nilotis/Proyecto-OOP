package org.catsharks.backend.controller;

import org.catsharks.frontend.gui.MyFrame;
import javax.swing.*;
import java.awt.*;
import static org.catsharks.frontend.gui.MyFrame.BRAND_NAME;
/**
 * Controladora principal del programa.
 * Instancia un JFrame y se le asignan los tamaños.
 */
public class Main {
    public static void main(String[] args) {
        JFrame fish_frame = new JFrame(BRAND_NAME);
        fish_frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        fish_frame.getContentPane().add (new MyFrame());
        fish_frame.pack();
        fish_frame.setVisible (true);
        fish_frame.setResizable(false);

        //Establezco las dimensiones de la aplicación.
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        fish_frame.setSize(570, 710);
        fish_frame.setLocation(screenWidth/4, screenHeight/4);
    }
}
