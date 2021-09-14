/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Cliente {
    ///Declaracion de los atributos.
    private String nombre;
    private int pin;
    private float saldo;
   

    public Cliente(String nombre, int pin, float saldo) {
        setNombre(nombre);
        setPin(pin);
        setSaldo(saldo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPin(int pin) {
        String cadenaPin=String.valueOf(pin);//Comprobamos que el pin tenga solo 4 caracteres
        if(cadenaPin.length()==4)
        {
            this.pin = pin;
        }
        else{
            System.out.println("Ingreso un pin con mas de 4 caracteres.");
        }
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPin() {
        return pin;
    }

    public float getSaldo() {
        return saldo;
    }
    //Metodo para hacer depositos;
    public void Deposito(float deposito){
        saldo+=deposito;
        System.out.println("Su saldo disponible es de:"+saldo);
    }
    //Metodo para retirar dinero
    public float Retiro(float retiro){
        if(retiro>saldo){
            System.out.println("Error,esta intentando retirar mas de lo que esta disponible.");
            return saldo;
        }
        else{
            saldo-=retiro;
            System.out.println("El retiro se ha realido con exito, su saldo disponible es de:"+saldo+" pesos");
            return saldo;
        }
    }
    
}
