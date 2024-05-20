/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6entornosdedesarrollo;

/**
 *
 * @author pedro
 */
public class TareaFactura {

    private static final int LIMITE_DESCUENTO = 3;
    private static final double DESCUENTO_BASICO = 0.95;
    private static final double DESCUENTO_PRIME = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > LIMITE_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_PRIME;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO_BASICO;
            mostrarTotal(total);

        }
    }

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }

}
