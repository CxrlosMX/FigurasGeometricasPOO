/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import clasePadre.Figura;
import clasesHijas.Cuadrado;
import clasesHijas.Triangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 25/06/2021
 *
 */
public class Aplicacion {

    public static void main(String[] args) {
        int op = 0;
        double medidaLado, base, altura;
        
        Cuadrado c;
        Triangulo t;
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n1.-CUADRADO\n2.-TRIANGULO\n3.-SALIR", "MENU", 1));
                switch (op) {
                    case 1: {

                        medidaLado = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce La medida de un lado del cuadrado", "Introduciendo Medida de un lado", 1));
                        c = new Cuadrado(medidaLado, 4);
                        c.mostrarDiagrama();
                        JOptionPane.showMessageDialog(null, c.toString(), "Mostrando Datos Cuadrado", 1);
                        break;
                    }
                    case 2: {

                        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la medida de la base", "Introduciendo Base", 1));
                        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la altura del triangulo", "Introduciendo Altura", 1));
                        t = new Triangulo(base, altura, 3);
                        t.mostrarDiagrama();
                        JOptionPane.showMessageDialog(null, t.toString(), "Informacion Triangulo", 1);
                        break;
                    }

                    case 3: {
                        JOptionPane.showMessageDialog(null, "Saliendo ", "Cerrando Aplicacion", 2);
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce valores validos por favor", "Error de opcion", 0);
                        break;
                    }

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }

        } while (op != 3);

    }

    /*public static int rellenarLados() {
        int numLados = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de lados", "Introduciendo numero de lados", 1));
        return numLados;
    }*/
}
