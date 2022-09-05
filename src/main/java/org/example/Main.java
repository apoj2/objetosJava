package org.example;

import clases.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        tienda.setCantidad(2);
        double consoletienda=tienda.calcularProducto();
        System.out.println(consoletienda);


    }
}