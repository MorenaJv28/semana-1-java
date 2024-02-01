package com.mycompany.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        String PrimerNumero;
        String SegundoNumero;
        int Num1;
        int Num2;
        int Suma;

        PrimerNumero =JOptionPane.showInputDialog("Escribe el primer entero: ");
        SegundoNumero = JOptionPane.showInputDialog("Escribe el segundo entero: ");

        Num1 = Integer.parseInt(PrimerNumero);
        Num2 = Integer.parseInt(SegundoNumero);

        Suma = Num1 + Num2;

        JOptionPane.showMessageDialog(null, "la suma es "+ Suma, "resultados", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}