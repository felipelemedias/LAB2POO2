/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2;

/**
 *
 * @author fleme
 */
public class Fit implements IVehicle{

    @Override
    public void start() {
        System.out.println("Honda Fit ligado");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda Fit");
    }

    @Override
    public void stop() {
        System.out.println("Honda Fit parado");    
    }
    
}
