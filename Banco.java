/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Banco {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        ArrayList <Cliente> cuentas=new ArrayList<>();//Importamos ArrayList para poder estar manejando los datos de los clientes.
        int opcion = 0;
        do{
            System.out.println("-------Menu de opciones-------\n"+
                    "1. Capturar Cliente.\n" +
                    "2. Acceder a cuenta.\n" +
                    "3. Salir.\n");       //Impresion de las opciones del menu
            System.out.println("ingrese una opcion:");
            opcion= scanner.nextInt();//Ingreso de la opcion del usuario
            switch(opcion){
                case 1:{
                    Cliente cuenta= new Cliente(CapturaEntrada.capturarCadena("Ingrese su nombre"), CapturaEntrada.capturarEntero("Ingrese su PIN"), CapturaEntrada.capturarFlotante("Ingrese su saldo"));
                    cuentas.add(cuenta);
                    break;
                }
                case 2:{
                    int pin=CapturaEntrada.capturarEntero("Ingrese su pin");
                    for(int i=0;i<cuentas.size();i++){
                        if(pin==cuentas.get(i).getPin()){
                            System.out.println("-------Menu de opciones de cuenta-------\n"+
                            "1. Deposito.\n" +
                            "2. Retiro.\n" +
                            "3. Salir.\n");       //Impresion de las opciones del menu
                            System.out.println("ingrese una opcion:");
                            int opcion2= scanner.nextInt();//Ingreso de la opcion del usuario
                            do{
                                switch(opcion2){
                                    case 1:{
                                        float deposito=CapturaEntrada.capturarFlotante("Ingresa el monto");
                                        cuentas.get(i).Deposito(deposito);//Se manda el monto a ingresar
                                        break;
                                    }
                                    case 2:{
                                        cuentas.get(i).Retiro(CapturaEntrada.capturarFlotante("Ingrese la cantidad a retirar"));//Mandamos el monto a retirar
                                        System.out.println("Retiro exitoso.");
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Adios");
                                        break;
                                    }
                                    default:{
                                        System.out.println("Ingreso una opcion invalida.");
                                        break;
                                    }
                                    }
                              }while(opcion2>=1 && opcion2<=2);
                            }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Esperamos que haya sido util.");
                    break;
                    }
                default:{
                    System.out.println("Error, ingreso una opcion incorrecta");
                    break;
                }
            }
            
        }while(opcion>=1 && opcion<=2);
    }
}
