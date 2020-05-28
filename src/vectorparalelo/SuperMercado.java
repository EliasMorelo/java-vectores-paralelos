package vectorparalelo;

import javax.swing.JOptionPane;

public class SuperMercado {

    private Producto prod;
    private int pos, tam = 0;

    public SuperMercado() {

        pos = 0;
        prod = new Producto(10);

    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void agregar(int pos, int cod, String nom, double pre, int cant) {
        if (pos < prod.getTam()) {

            prod.setCodigo(cod, pos);
            prod.setNombre(nom, pos);
            prod.setCantidad(cant, pos);
            prod.setPrecio(pre, pos);

            pos++;
        } else {
            JOptionPane.showConfirmDialog(null, "el vector esta lleno");
        }
        tam += 1;
    }

    public void mostrarCantidad() {
        String mensaje = "";

        for (int j = 0; j < prod.getTam(); j++) {
            if (prod.getCodigo(j) > 0) {
                mensaje += "\tnombre:" + prod.getNombre(j) + "\tcantidad:" + prod.getCantidad(j) + "\tvalor total" + prod.getCantidad(j) * prod.getPrecio(j) + "\n";
            }
        }

        JOptionPane.showConfirmDialog(null, mensaje);

    }

    public void mostrar() {
        String mensaje = "";

        for (int j = 0; j < prod.getTam(); j++) {
            if (prod.getCodigo(j) > 0) {
                mensaje += "codigo:" + prod.getCodigo(j) + "\tnombre:" + prod.getNombre(j) + "\tprecio:" + prod.getPrecio(j) + "\tcantidad:" + prod.getCantidad(j) + "\n";
            }
        }

        JOptionPane.showConfirmDialog(null, mensaje);

    }

    public void mostrarMayores() {
        String mayor1 = "", mayor2 = "", mayor3 = "";
        double valor = prod.getPrecio(0);
        double primerMayor = 0000, segundoMayor = 0000, tercerMayor = 0000;
        for (int j = 0; j < prod.getTam(); j++) {
            if (prod.getPrecio(j) >= valor) {
                primerMayor = prod.getPrecio(j);
                mayor1 = "nombre: " + prod.getNombre(j) + " precio: " + prod.getPrecio(j);
            }
        }
        double valor2 = 0000;
        double valor3 = 0000;
        for (int j = 0; j < prod.getTam(); j++) {
            if (prod.getPrecio(j) < primerMayor) {
                valor2 = prod.getPrecio(j);
                if (valor2 >= valor3) {
                    valor3 = prod.getPrecio(j);
                    segundoMayor = prod.getPrecio(j);
                    mayor2 = "nombre:  " + prod.getNombre(j) + "  precio: " + prod.getPrecio(j);
                }
            }
        }
        double valor4 = 0000;
        double valor5 = 0000;
        for (int j = 0; j < prod.getTam(); j++) {
            if (prod.getPrecio(j) < segundoMayor) {
                valor4 = prod.getPrecio(j);
                if (valor4 >= valor5) {
                    valor5 = prod.getPrecio(j);
                    tercerMayor = prod.getPrecio(j);
                    mayor3 = "nombre:  " + prod.getNombre(j) + "  precio: " + prod.getPrecio(j);
                }
            }
        }

        JOptionPane.showConfirmDialog(null, "Los 3 elementos con mayor precio son:" +"\n"+mayor1 + "\n" + mayor2 + "\n" + mayor3);
    }
}
