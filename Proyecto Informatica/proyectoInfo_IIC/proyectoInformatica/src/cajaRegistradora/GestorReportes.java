package cajaRegistradora;
//import Carrito.itemCarrito;
//import Carrito.Carrito;
//import java.util.HashMap;

public class GestorReportes {

    // * Atributos
//    private double totalVentasBrutas;
//    private double totalImpuestosRecaudados;
//    private HashMap<String, Integer> productsMasVendidos; //clave: Nombre del producto | Valor: Cantidad total vendida
//    private HashMap<String, Double> ventasPorCategoria;//clave: Categoría (Lácteos, Panadería, etc.) | Valor: Total de dinero generado
//
//    constructor
//    public GestorReportes() {
//        this.totalVentasBrutas = 0.0;
//        this.totalImpuestosRecaudados = 0.0;
//        this.productsMasVendidos = new HashMap<>();
//        this.ventasPorCategoria = new HashMap<>();
//    }
//
//    public void registrarVenta(factura f) {
//        this.totalVentasBrutas += f.total;
//        
//         * calcular el IVA del 13%
//        double subtotalFactura = f.total / 1.13;
//        double impuestoFactura = f.total - subtotalFactura;
//        this.totalImpuestosRecaudados += impuestoFactura;
//
//         * recorrer productos para actualizar los datos
//        for (var item : f.carrito.getListaCompras()) {
//            String nombreProd = item.getProducto().nombreProducto;
//                int cantidad = item.getCantidadProducto();
//
//            String categoria = item.getProducto().tipoProducto; //
//                double subtotalItem = item.getSubTotal();
//
//             Productos Más Vendidos
//            int cantidadActual = productsMasVendidos.getOrDefault(nombreProd, 0);
//            productsMasVendidos.put(nombreProd, cantidadActual + cantidad);
//
//             Ventas por Categoría
//            double dineroActualCategoria = ventasPorCategoria.getOrDefault(categoria, 0.0);
//            ventasPorCategoria.put(categoria, dineroActualCategoria + subtotalItem);
//        }
//    }
//
//    public double getTotalVentasBrutas() {
//        return this.totalVentasBrutas;
//    }
//
//    public double getTotalImpuestosRecaudados() {
//        return this.totalImpuestosRecaudados;
//    }
//
//    public double getTotalVentasNetas() {
//        return this.totalVentasBrutas - this.totalImpuestosRecaudados;
//    }
//
//    public HashMap<String, Integer> getProductsMasVendidos() {
//        return this.productsMasVendidos;
//    }
//
//    public HashMap<String, Double> getVentasPorCategoria() {
//        return this.ventasPorCategoria;
//    }
//
//     * texto para meter en una caja de texto
//    /**
//     * Genera un texto limpio y formateado para que puedas colocarlo 
//     * directamente dentro de un componente de texto de tu ventana (ej. JTextArea).
//      * meter cierre de comentario
//    public String obtenerTextoReporteContable() {
//        return String.format(
//            "--- BALANCE CONTABLE ---\n" +
//            "Ventas Brutas: $%.2f\n" +
//            "IVA Recaudado: $%.2f\n" +
//            "Ventas Netas:  $%.2f", 
//            this.totalVentasBrutas, this.totalImpuestosRecaudados, this.getTotalVentasNetas()
//        );
//    }
//*/
}
