package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.setContentPane(formulario.getMainPanel());
        formulario.setVisible(true);
        formulario.setBounds(300,300,600,300);
        formulario.setResizable(false);
        formulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}