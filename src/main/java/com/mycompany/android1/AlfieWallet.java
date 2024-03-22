/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.android1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author aenim
 */
public class AlfieWallet implements Wallet{
        //Propiedades de la clase
    private double saldo;
    public List<String> transacciones = new ArrayList<>();


    //Instanciación de la clase Scanner
    Scanner scanner = new Scanner(System.in);


    //Sobreescritura e implementación de los metodos previamente definidos en la intefaz de Wallet
    @Override
    public double obtenerSaldo() {
        return saldo;
    }

    @Override
    public void retirar(double cantidad) {
        System.out.println("cantidad en AlfiWallet " + cantidad);
        if (cantidad > 0) { //&& saldo >= cantidad
            saldo -= cantidad;
            transacciones.add("Retiro: " + cantidad);

            System.out.println("restando......" + cantidad);

            // Obtener la fecha actual
            Date fechaActual = new Date();

            // Formatear la fecha
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String fechaFormateada = formatoFecha.format(fechaActual);

            // Agregar la transacción con la fecha
            transacciones.add("Retiro de $" + cantidad + " realizado en: " + fechaFormateada);


        } else {
            System.out.println("Ingrese un número mayor a 0 y menor o igual al saldo actual" + saldo);

        }
    }

    @Override
    public void convertirMoneda(double cantidad,  String aMoneda) {

        double cantidadConvertida;
        double tasaDeCambio;

        if(aMoneda.equals("1")) {
            tasaDeCambio =  0.0010204081632653;
            cantidadConvertida = cantidad * tasaDeCambio;
            System.out.println("Su saldo actual convertido a Dólares es aproximadamente: "+Math.round(cantidadConvertida)+"USD.");
        }

        if(aMoneda.equals("2")) {
            tasaDeCambio =  0.00094;
            cantidadConvertida = cantidad * tasaDeCambio;
            System.out.println("Su saldo actual convertido a Euros es aproximadamente: "+Math.round(cantidadConvertida)+"EUR.");
        }

    }

    @Override
    public void depositar(double cantidad) {

        saldo += cantidad;
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Formatear la fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formatoFecha.format(fechaActual);

        // Agregar la transacción con la fecha
        transacciones.add("Deposito de $" + cantidad + " realizado en: " + fechaFormateada);



    }
}
