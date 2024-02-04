/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2;

/**
 *
 * @author fleme
 */
public class Toyota implements IVehicleMaker{

    private static Toyota instancia;
    
    public static Toyota getInstancia(){
        if(instancia == null){
            instancia = new Toyota();
        }
        return instancia;
    }
    
    
    @Override
    public IVehicle makeVehicle(String modelo) {
        
        if("Corolla".equalsIgnoreCase(modelo)){
            return new Corolla();
        } else if ("Hilux".equalsIgnoreCase(modelo)){
            return new Hillux();
        }
        else if ("Etios".equalsIgnoreCase(modelo)){
            return new Etios();
        }
        return null;
    } 
}
