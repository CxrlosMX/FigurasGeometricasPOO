/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHijas;

import clasePadre.Figura;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 25/06/2021
 *
 */
public class Triangulo extends Figura {

    private double base, altura;

    public Triangulo(double base, double altura, int numLados) {
        super(numLados);
        this.base = base;
        this.altura = altura;
    }

  

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((base * altura) / 2);
    }

    @Override
    public double calcularPerimetro() {
        return (base * super.getNumLados());
    }

    @Override
    public void mostrarDiagrama() {
        for (int i = 0; i < this.getBase(); i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase: " + base + "\nAltura: " + altura;
    }

}
