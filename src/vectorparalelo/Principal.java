/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorparalelo;

/**
 *
 * @author Ideapad S145
 */
public class Principal {

    public static void main(String[] args) {

        SuperMercado supe = new SuperMercado();

        supe.agregar(0, 789, "crema dental ", 7200, 15);
        supe.agregar(1, 123, "jabon ", 1200, 5);
        supe.agregar(2, 456, "detergente ", 20000, 18);
        supe.agregar(3, 021, "arroz", 1800, 50);
        supe.agregar(4, 101, "coca cola", 5000, 20);
        supe.agregar(5, 1016, "pesi", 5500, 200);
        supe.agregar(6, 106, "platanos", 105000, 206);
        supe.agregar(7, 186, "jugo", 100000, 45);
        supe.agregar(8, 18, "papas", 107000, 5);

        supe.mostrar();
        supe.mostrarCantidad();
        supe.mostrarMayores();
    }

}
