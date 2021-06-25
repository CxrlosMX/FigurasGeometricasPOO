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
public class Cuadrado extends Figura {

    private double medidaLado;

    public Cuadrado(double medidaLado, int numLados) {
        super(numLados);
        this.medidaLado = medidaLado;
    }

    public double getMedidaLado() {
        return medidaLado;
    }

    public void setMedidaLado(double medidaLado) {
        this.medidaLado = medidaLado;
    }

    @Override
    public double calcularArea() {
        return (medidaLado * medidaLado);
    }

    @Override
    public double calcularPerimetro() {
        return (medidaLado * super.getNumLados());
    }

    @Override
    public void mostrarDiagrama() {
        for (int i = 0; i < medidaLado; i++) {
            for (int j = 0; j < this.medidaLado; j++) {
                System.out.print("    *    ");
            }
            System.out.println("   ");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMedida Lado: " + medidaLado;
    }

}
