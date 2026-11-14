package cajaRegistradora;

import Usuario.*;
import Carrito.*;
import Producto.*;
import javax.swing.*;
//import java.awt.Label;
import java.awt.Desktop;
//import java.awt.event.*;
import java.util.*;
import java.io.*;

public class CajaRegistradora extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CajaRegistradora.class.getName());

    private Empleado actEmployee;
    private Carrito currentCart;
    private ArrayList<Product> simInvent;
    private javax.swing.JLabel lblTotalPrice;

    //Constructor
    public CajaRegistradora(Empleado employeeLoggin) {
        this.actEmployee = employeeLoggin;

        //iniciar carro e invt
        this.currentCart = new Carrito();
        this.simInvent = new ArrayList<>(); //inicia vacio

        cargarInventario(); //cargar inventario
        initComponents();   //carga interfaz

        //conectar inventario y boton de pago
        inventory.addActionListener(this::inventoryActionPerformed);
        bttnPay.addActionListener(this::bttnPayActionPerformed);

        //configurar el label que muestra el precio dentro del bloque negro
        this.lblTotalPrice = new javax.swing.JLabel("$0.00", javax.swing.SwingConstants.CENTER);
        this.lblTotalPrice.setForeground(java.awt.Color.WHITE);
        this.lblTotalPrice.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 28));
        jlbTotalPrice.setLayout(new java.awt.BorderLayout());
        jlbTotalPrice.add(this.lblTotalPrice, java.awt.BorderLayout.CENTER);

        //Configuraciones extra de la ventana
        setTitle("Supermercado Caja registradora - Panel de Ventas");
        setLocationRelativeTo(null); // Centra la ventana en pantalla

        if (employeeLoggin.getworkstation().equals("Cajero")) {

            jmMenuMantenimieto.setVisible(false);
            
        }
    }
/*
    public CajaRegistradora() {
        this(null);
    }
*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jpTotalPrice = new javax.swing.JPanel();
        jlbTotalPrice = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        tfIdProducts = new java.awt.TextField();
        bttnInputList = new javax.swing.JButton();
        bttnPay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaProductList = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMenuMantenimieto = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        inventory = new javax.swing.JMenuItem();
        jmFacture = new javax.swing.JMenu();
        jmiGenerarFactura = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jpTotalPrice.setBackground(new java.awt.Color(0, 0, 0));

        jlbTotalPrice.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jlbTotalPrice.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jpTotalPriceLayout = new javax.swing.GroupLayout(jpTotalPrice);
        jpTotalPrice.setLayout(jpTotalPriceLayout);
        jpTotalPriceLayout.setHorizontalGroup(
            jpTotalPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTotalPriceLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jlbTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jpTotalPriceLayout.setVerticalGroup(
            jpTotalPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTotalPriceLayout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(jlbTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setText("Productos Escaneados");

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setText("Precio Total de Productos");

        bttnInputList.setText("Introducir a la lista");
        bttnInputList.addActionListener(this::bttnInputListActionPerformed);

        bttnPay.setText("Proceder Pago");
        bttnPay.addActionListener(this::bttnPayActionPerformed);

        jtaProductList.setBackground(new java.awt.Color(255, 255, 255));
        jtaProductList.setColumns(20);
        jtaProductList.setForeground(new java.awt.Color(255, 255, 255));
        jtaProductList.setRows(5);
        jtaProductList.setCaretColor(new java.awt.Color(255, 255, 255));
        jtaProductList.setEnabled(false);
        jScrollPane1.setViewportView(jtaProductList);

        jmMenuMantenimieto.setText("Mantenimiento");

        jMenuItem1.setText("Usuarios");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jmMenuMantenimieto.add(jMenuItem1);

        inventory.setText("Inventario");
        inventory.addActionListener(this::inventoryActionPerformed);
        jmMenuMantenimieto.add(inventory);

        jMenuBar1.add(jmMenuMantenimieto);

        jmFacture.setText("Factura");

        jmiGenerarFactura.setText("Generar");
        jmiGenerarFactura.addActionListener(this::jmiGenerarFacturaActionPerformed);
        jmFacture.add(jmiGenerarFactura);

        jMenuBar1.add(jmFacture);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfIdProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnInputList, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(65, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfIdProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bttnInputList, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(bttnPay, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bttnInputListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnInputListActionPerformed
        //capturar texto
        String textID = tfIdProducts.getText().trim();

        if (textID.isEmpty()) {

            //aviso si se preiona el boton sin datos
            JOptionPane.showMessageDialog(this, "Ingrese un código de producto.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //validar para no buscar si la lista del inventario no ha cargado
        if (this.simInvent == null || this.simInvent.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El inventario no se ha cargado en memoria. Revisar el archivo CSV.", "Inventario Vacío", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int idBuscado = Integer.parseInt(textID);
            Product productFound = null;

            //recorrer el inventario cargado en memoria buscando el id
            for (Product p : this.simInvent) {
                if (p.productId == idBuscado) {
                    productFound = p;
                    break;
                }
            }

            //si está el producto se añade a la lista
            if (productFound != null) {
                currentCart.agregarProductos(productFound, 1);

                StringBuilder sb = new StringBuilder();
                for (var item : currentCart.getListaCompras()) {
                    String name = item.getProduct().productName;
                    int amount = item.getProductQuantity();

                    //formato: nombre y cantidad
                    sb.append(String.format("%-15s......................x%d\n", name, amount));

                }

                //meter a la caja del producto
                jtaProductList.setText(sb.toString());

                //actualizar el precio total acumulado
                actualizarPrecioTotal();

            } else {
                //por si el producto no existe
                JOptionPane.showMessageDialog(this, "Producto no registrado en inventario", "Codigo Invalido", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException ex) {

            //por si meten letras y no numeros
            JOptionPane.showMessageDialog(this, "Digite un código numérico válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);

        }

        tfIdProducts.setText("");
    }//GEN-LAST:event_bttnInputListActionPerformed

    //calcular el total del precio y mostrarlo
    private void actualizarPrecioTotal() {
        double total = currentCart.calcularTotal();
        lblTotalPrice.setText(String.format("$%.2f", total));
    }

    
    private void generarYAbrirFactura() {
        int numBill = (int) (System.currentTimeMillis() % 100000);
        String dateTime = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date());
 
        factura nuevaFactura = new factura(numBill, dateTime, currentCart, currentCart.calcularTotal());
        File archivoFactura = nuevaFactura.genArchiveTxt();
 
        //abrir el archivo generado automáticamente
        if (archivoFactura != null && archivoFactura.exists()) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(archivoFactura);
 
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "La factura se generó pero no se pudo abrir automáticamente.", "Error al Abrir", JOptionPane.ERROR_MESSAGE);
                    logger.log(java.util.logging.Level.SEVERE, null, ex);
                }
 
            } else {
                JOptionPane.showMessageDialog(this, "Factura generada en: " + archivoFactura.getAbsolutePath(), "Factura Generada", JOptionPane.INFORMATION_MESSAGE);
            }
 
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al generar la factura.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void jmiGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGenerarFacturaActionPerformed

        //validar que haya productos antes de generar la factura
        if (currentCart.getListaCompras().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío, no se puede generar la factura.", "Carrito Vacío", JOptionPane.WARNING_MESSAGE);
                return;
        }
        
        
        generarYAbrirFactura();
    }//GEN-LAST:event_jmiGenerarFacturaActionPerformed


    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        //Ruta de los objetos del inventario
        String rutaInventario = System.getProperty("user.dir") + File.separator + "src" + File.separator + "Producto" + File.separator + "inventario.csv";
        File archiveInventory = new File(rutaInventario);

        if (!archiveInventory.exists()) {
            JOptionPane.showMessageDialog(this,
                    "No se encontró el archivo en la ruta: \n" + rutaInventario,
                    "Error de Archivo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Desktop.isDesktopSupported()) {
            JOptionPane.showMessageDialog(this,
                    "Este sistema no permite abrir archivos externos automáticamente.",
                    "Función no soportada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Desktop.getDesktop().open(archiveInventory);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    "No se pudo abrir el archivo. Verifique que tenga un programa asociado a .csv (ej. Excel).",
                    "Error al Abrir", JOptionPane.ERROR_MESSAGE);
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inventoryActionPerformed

    
    private void bttnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnPayActionPerformed
         if (currentCart.getListaCompras().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío, no hay nada que pagar.", "Carrito Vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }
 
        //opciones pago
        Object[] opcionesPago = {"Datáfono", "PayPal"};
        int seleccion = JOptionPane.showOptionDialog(
                this,
                "Total a pagar: $" + String.format("%.2f", currentCart.calcularTotal()) + "\nSeleccione el método de pago:",
                "Proceder con el Pago",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesPago,
                opcionesPago[0]
        );
        
        if (seleccion == JOptionPane.CLOSED_OPTION) {
            return;
        }
 
        String metodoPago = (seleccion == 0) ? "Datáfono" : "PayPal";
        JOptionPane.showMessageDialog(this,
                "Pago procesado con éxito mediante " + metodoPago + ".\nTotal cobrado: $" + String.format("%.2f", currentCart.calcularTotal()),
                "Pago Exitoso", JOptionPane.INFORMATION_MESSAGE);
        
        //generar la factura ANTES de vaciar el carrito, ya que necesita sus datos
        generarYAbrirFactura();
        //
        
        //vaciar el carrito
        currentCart.vaciarCarrito();
        jtaProductList.setText("");
        actualizarPrecioTotal();
    }//GEN-LAST:event_bttnPayActionPerformed

    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //cargar inventario
    private void cargarInventario() {
        String archiveRute = System.getProperty("user.dir") + File.separator + "src" + File.separator + "Producto" + File.separator + "inventario.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(archiveRute))) {
            
            //leer columnas hasta que se terminen los datos
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                //separar datos con . y ;
                String[] datos = line.split(";|,");

                //solo ver las columnas necesarias
                if (datos.length < 3) {
                    continue;
                }

                //extraer y limpiar el ID de caracteres
                String idClean = datos[0].trim().replaceAll("[^0-9]", "");

                //ignorar primera línea (encabezado)
                if (idClean.isEmpty() || datos[0].equalsIgnoreCase("ID")) {
                    continue;
                }

                //extraer y limpiar datos del csv
                String name = datos[1].trim();
                String category = (datos.length > 3) ? datos[3].trim() : "General";

                //cambiar la coma(,) por punto(.) para que java entienda
                double price = Double.parseDouble(datos[2].trim().replace(",", "."));
                int id = Integer.parseInt(idClean);

                //añadir producto a la lista
                this.simInvent.add(new Product(name, category, id, price, price));
            }

            System.out.println("Inventario cargado con éxito. Total productos: " + this.simInvent.size());

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "No se encontró el archivo en la ruta: \n" + archiveRute,
                    "Error de Archivo", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Error de lectura: Hay caracteres extraños .",
                    "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        Login lg = new Login();
        lg.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnInputList;
    private javax.swing.JButton bttnPay;
    private javax.swing.JMenuItem inventory;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbTotalPrice;
    private javax.swing.JMenu jmFacture;
    private javax.swing.JMenu jmMenuMantenimieto;
    private javax.swing.JMenuItem jmiGenerarFactura;
    private javax.swing.JPanel jpTotalPrice;
    private javax.swing.JTextArea jtaProductList;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField tfIdProducts;
    // End of variables declaration//GEN-END:variables
}
