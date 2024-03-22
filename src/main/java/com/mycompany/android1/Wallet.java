/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.android1;

/**
 *
 * @author aenim
 */
public interface Wallet {
    
    double obtenerSaldo();

    void depositar(double cantidad);

    void retirar(double cantidad);

    void convertirMoneda(double cantidad, String aMoneda);
}
