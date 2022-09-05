package clases;

import java.util.Scanner;

public class Tienda {
    private int cantidad;
    private final double IVA=0.19;

    public Tienda() {
    }

    public Tienda(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIVA() {
        return IVA;
    }

    public double calcularProducto(){

        Producto producto = new Producto();

        Scanner digiteEntrada = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        int precio = digiteEntrada.nextInt();

        producto.setPrecio(precio);

        double valorNeto = producto.getPrecio() * this.cantidad;

        double valorIVA = valorNeto * this.IVA;

        double valorTotal = valorNeto + valorIVA;

        return  valorTotal;
    }
}
