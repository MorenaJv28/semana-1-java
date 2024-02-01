package com.mycompany.nombres;

import javax.swing.JOptionPane;

public class Nombres {

    public static void main(String[] args)
    {
        String Nombre, Apellido;

        Nombre = JOptionPane.showInputDialog("Ingrese su nombre ");
        Apellido = JOptionPane.showInputDialog("Ingrese su apellido ");

        JOptionPane.showMessageDialog(null, String.format("Buen dia: %s %s",Nombre, Apellido));
    }
}
