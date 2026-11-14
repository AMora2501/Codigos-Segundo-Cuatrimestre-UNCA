package cajaRegistradora;
import Carrito.Carrito;
import java.io.*;

public class factura {

    // * atributos
    public int numBill;           //numero factura
    public String dateTime;       //fecha dia
    public Carrito shoppingCart;  //el carro con los productos
    public double total;          //total de los productos
    public double productPrice;   //Precio de los productos

    // * constructor
    public factura(int numBill, String dateTime, Carrito shoppingCart, double total) {
        this.numBill = numBill;
        this.dateTime = dateTime;
        this.shoppingCart = shoppingCart;

        double totalCalculado = shoppingCart.calcularTotal();
        if (totalCalculado >= 0) {
            this.total = totalCalculado;

        } else {
            this.total = 0;

        }
    }

    // * Crear Facturas
    public File genArchiveTxt() {
        String rutaCarpeta = System.getProperty("user.dir") + File.separator + "Facturas";
        File carpetaFacturas = new File(rutaCarpeta);
        if (!carpetaFacturas.exists()) {
            carpetaFacturas.mkdirs();
        }

        String archiveName = "factura_" + this.numBill + ".txt";
        File archiveFile = new File(carpetaFacturas, archiveName);

        //crear archivo y escribir en el
        try (PrintWriter pw = new PrintWriter(new FileWriter(archiveFile))) {

            //encabezado factura
            pw.println("=================================");
            pw.println("        SUPERMERCADO cajaR       ");
            pw.println("=================================");
            pw.println("Factura No: " + this.numBill);
            pw.println("Fecha/Hora: " + this.dateTime);
            pw.println("---------------------------------");
            pw.println("Prod.       Cant.       Subtotal");
            pw.println("---------------------------------");

            //recorer carrito
            for (var item : this.shoppingCart.getListaCompras()) {
                pw.println(item.getProduct().productName + "   x"
                        + item.getProductQuantity() + "   $" + item.getSubTotal());
            }

            //pie factura
            pw.println("---------------------------------");
            pw.printf("TOTAL A PAGAR:           $%.2f\n", this.total);
            pw.println("=================================");
            pw.println("    ¡Gracias por su compra!      ");

            System.out.println("Factura física generada con éxito como: " + archiveName);

            return archiveFile;
            
        } catch (Exception e) {
            System.out.println("Error, Factura no generada en texzto: " + e.getMessage());

            return null;
        }
    }
}
