/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2;

/**
 *
 * @author fleme
 */
public class Etios implements IVehicle{

    @Override
    public void start() {
        System.out.println("Toyota Etios ligado");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Toyota Etios");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Etios parado");    
    }
    
}
