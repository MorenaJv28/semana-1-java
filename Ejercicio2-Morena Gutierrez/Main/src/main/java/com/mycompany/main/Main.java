package com.mycompany.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        String PrimerNumero;
        String SegundoNumero;
        String TercerNumero;
        float Num1, Num2, Num3, Suma, Resta, Multiplicacion;
        
        PrimerNumero =JOptionPane.showInputDialog("Escribe el primer numero: ");
        SegundoNumero = JOptionPane.showInputDialog("Escribe el segundo numero: ");
        TercerNumero = JOptionPane.showInputDialog("Escribe el tercer numero: ");

        Num1 = Float.parseFloat(PrimerNumero);
        Num2 = Float.parseFloat(SegundoNumero);
        Num3 = Float.parseFloat(TercerNumero);

        Suma = Num1 + Num2 + Num3;
        Resta = Num1 - Num2 - Num3;
        Multiplicacion = Num1 * Num2 * Num3;

        JOptionPane.showMessageDialog(null, String.format("La suma es: %.2f\nLa resta es: %.2f\nLa multiplicacion es: %.2f",Suma,Resta, Multiplicacion), "resultados", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}