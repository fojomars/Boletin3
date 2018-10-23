/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author fojomars
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Apartado a
        Consumo objeto = new Consumo();
        
        // Apartado b
        objeto.setLitros(50f);
        objeto.setPGas(1.57f);
        
        // Apartado c
        Consumo objeto1 = new Consumo(685f,70f,50f,1.57f);
        
        // Apartado d
        System.out.println("El consumo medio = " + objeto1.consumoMedio());
        
        // Apartado e
        objeto1.setLitros(60f);
        
        // Apartado f
        System.out.println("La velocidad media es: " + objeto1.getvMed());
        
        
    }
    
}
