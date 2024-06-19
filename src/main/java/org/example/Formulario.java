package org.example;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formulario extends JFrame {
    private JButton btnCalcular;
    private JTextField txtAltura;
    private JTextField txtPeso;
    private JLabel lblImc;
    private JPanel mainPanel;

    public Formulario() {
        btnCalcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                calcularImc();
            }
        });
    }
    public void calcularImc(){
        // kg/a*a en cm
        float peso = Float.parseFloat(txtPeso.getText()) ;
        float altura = Float.parseFloat(txtAltura.getText()) ;
        float imc = peso / (altura * altura);

        String clasificacion = getString(imc);

        lblImc.setText("IMC: " + imc + " - " + clasificacion);

    }

    private static String getString(float imc) {
        String clasificacion;
        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            clasificacion = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            clasificacion = "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            clasificacion = "Obesidad I";
        } else if (imc >= 35 && imc < 39.9) {
            clasificacion = "Obesidad II";
        } else {
            clasificacion = "Obesidad III";
        }
        return clasificacion;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JLabel getLblImc() {
        return lblImc;
    }

    public void setLblImc(JLabel lblImc) {
        this.lblImc = lblImc;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTextField getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(JTextField txtAltura) {
        this.txtAltura = txtAltura;
    }

    public JTextField getTxtPeso() {
        return txtPeso;
    }

    public void setTxtPeso(JTextField txtPeso) {
        this.txtPeso = txtPeso;
    }
}
