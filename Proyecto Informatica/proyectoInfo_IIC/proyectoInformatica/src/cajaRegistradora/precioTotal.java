
/*
package cajaRegistradora;
import javax.swing.*;
import Producto.*;
import Carrito.*;
public class precioTotal {

    /**
     * ACCIÓN DEL ESCÁNER / ENTRADA
     * Busca el producto digitado por el cajero, lo añade al carrito si existe
     * y dispara la actualización del bloque blanco y del monto total.



    private void procesarEscaneo() {
        try {
            int idDigitado = Integer.parseInt(txtEscaner.getText().trim());
            producto productoEncontrado = null;

            // Buscamos el producto en nuestro inventario
            for (producto p : simInbe) {
                if (p.productId == idDigitado) {
                    productoEncontrado = p;
                    break;
                }
            }

            if (productoEncontrado != null) {
                // 1. Se añade al carrito de compras
                carritoActual.agregarProductos(productoEncontrado, 1);

                // 2. Actualizamos la lista del bloque blanco
                actualizarListaProductosVisual();

                // 3. ¡NUEVO FLUJO!: Calculamos el total y actualizamos el monto de inmediato
                calcularYMostrarTotal();

            } else {
                JOptionPane.showMessageDialog(this, "Producto no registrado.", "Código Inválido",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, digite un ID numérico válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        txtEscaner.setText(""); // Limpiar la barra para la siguiente lectura
    }

    /**
     * NUEVO MÉTODO EXCLUSIVO PARA EL BLOQUE NEGRO
     * Realiza el cálculo del monto acumulado en el carrito y lo estampa en la
     * pantalla digital.
     
    private void calcularYMostrarTotal() {
        // Le pide al carrito el cálculo matemático en tiempo real
        double totalAcumulado = carritoActual.calcularTotal();

        // Formatea el resultado económico y lo inyecta en el bloque negro
        lblTotalPantalla.setText(String.format("$%.2f ", totalAcumulado));
    }

    /**
     * MÉTODO EXCLUSIVO PARA EL BLOQUE BLANCO
     * Redibuja el texto de la lista de compras del cliente.
     
    private void actualizarListaProductosVisual() {
        if (carritoActual.getListaCompras().isEmpty()) { // [cite: 2]
            txtListaProductos.setText("\n   *** ESPERANDO PRODUCTOS ***");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            for (var item : carritoActual.getListaCompras()) { // [cite: 2]
                String nombre = item.getProducto().productName;
                int cant = item.getCantidadProducto();
                sb.append(String.format("  %-15s............x%d\n", nombre, cant));
            }
            txtListaProductos.setText(sb.toString());
        }
    }
}
*/