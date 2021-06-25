/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePadre;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 25/06/2021
 *
 */
public abstract class Figura {

  
    private int numLados;

    public Figura(int numLados) {
  
        this.numLados = numLados;
    }

   

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
    
    public abstract void mostrarDiagrama();

    @Override
    public String toString() {
        return "Area: " + calcularArea() + "\nPerimetro: "  +calcularPerimetro()+ "\nNumero de Lados: " + numLados ;
    }
    

}
