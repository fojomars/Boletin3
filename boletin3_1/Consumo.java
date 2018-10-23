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
public class Consumo {
//Declaramos las variable
    private float km;  //kilometros percorridos polo coche
    private float litros;  //Litros de combustible cosumidos
    private float vMed;    //Velocidad media
    private float pGas;    //Prezo da gasolina
    
//Contructor sen parámetros    
    public Consumo(){   
    }

//Constructor con parámetros
    public Consumo(float km, float litros, float vMed, float pGas){
        this.km =km;
        this.litros =litros;
        this.vMed =vMed;
        this.pGas =pGas;
    }

//Métodos de acceso
    //Método de acceso km
    public void setKms(float km){
        this.km = km;
    }
    
    public double getKms(){
        return km;
    }
    
    //Método de acceso litros
    public void setLitros(float litros){
        this.litros = litros;
    }
    
    public double getLitros(){
        return litros;
    }

    //Método de acceso vMed
    public void setvMed(float vMed){
        this.vMed = vMed;
    }
    
    public double getvMed(){
        return vMed;
    }   
    
    //Método de acceso pGas
    public void setPGas(float pGas){
        this.pGas = pGas;
    }
    
    public double getPGas(){
        return pGas;
    }
    
    //Método de acceso tempo
    
    public double getTempo(){
        double tempo = km/vMed;
        return tempo;
    }
    
    //Calcular consumo medio
    public float consumoMedio(){
        float consumoMedio;
        consumoMedio = litros/km*100;
        return consumoMedio;
    }
    
    //Calcular consumo euros
    public double consumoEuros(){
        double consumoEuros;
        consumoEuros = pGas/this.consumoMedio()*100;
        return consumoEuros;
    }
    
    
    
}
