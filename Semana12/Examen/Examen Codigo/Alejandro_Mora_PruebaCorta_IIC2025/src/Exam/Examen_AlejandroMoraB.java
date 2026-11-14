package Exam;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;

public class Examen_AlejandroMoraB extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Examen_AlejandroMoraB.class.getName());

    private DefaultTableModel modeloTabla;
    private static final double DESCUENTO_HOMBRE = 0.04;
    private static final double DESCUENTO_MUJER = 0.06;
    private static final double IVA = 0.13;
    private final DecimalFormat df = new DecimalFormat("#,##0.00");

    public Examen_AlejandroMoraB() {
        initComponents();
        configurarTabla();
        setLocationRelativeTo(null);
    }

    private void configurarTabla() {
        String[] columnas = {"Descripción", "Cantidad", "Precio unitario", "Precio total", "Descuento", "Precio neto"};
        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(modeloTabla);
        txtPrecioNeto.setText("0.00");
        txtPrecioTotal.setText("0.00");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelFormulario = new javax.swing.JPanel();
        jLabelSexo = new javax.swing.JLabel();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        jLabelDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabelPrecioUnitario = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelTotales = new javax.swing.JPanel();
        jLabelPrecioNeto = new javax.swing.JLabel();
        txtPrecioNeto = new javax.swing.JTextField();
        jLabelPrecioTotal = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la prenda"));

        jLabelSexo.setText("Sexo del cliente:");

        buttonGroup1.add(rbHombre);
        rbHombre.setText("Hombre");

        buttonGroup1.add(rbMujer);
        rbMujer.setText("Mujer");

        jLabelDescripcion.setText("Descripción de la prenda:");

        jLabelCantidad.setText("Cantidad:");

        jLabelPrecioUnitario.setText("Precio unitario:");

        btnGuardar.setText("Guardar Prenda");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbHombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMujer))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelPrecioUnitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(rbHombre)
                    .addComponent(rbMujer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioUnitario)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Cantidad", "Precio unitario", "Precio total", "Descuento", "Precio neto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanelTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));

        jLabelPrecioNeto.setText("Precio Neto:");

        txtPrecioNeto.setEditable(false);

        jLabelPrecioTotal.setText("Precio Total (IVA incluido):");

        txtPrecioTotal.setEditable(false);

        javax.swing.GroupLayout jPanelTotalesLayout = new javax.swing.GroupLayout(jPanelTotales);
        jPanelTotales.setLayout(jPanelTotalesLayout);
        jPanelTotalesLayout.setHorizontalGroup(
            jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrecioNeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPrecioTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTotalesLayout.setVerticalGroup(
            jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioNeto)
                    .addComponent(txtPrecioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecioTotal)
                    .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String descripcion = txtDescripcion.getText().trim();
        String cantidadTexto = txtCantidad.getText().trim();
        String precioTexto = txtPrecioUnitario.getText().trim();

        if (descripcion.isEmpty() || cantidadTexto.isEmpty() || precioTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos antes de guardar.", "Datos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!rbHombre.isSelected() && !rbMujer.isSelected()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el sexo del cliente.", "Datos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double cantidad;
        double precioUnitario;
        try {
            cantidad = Double.parseDouble(cantidadTexto);
            precioUnitario = Double.parseDouble(precioTexto);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Cantidad y precio unitario deben ser valores numéricos.", "Dato inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cantidad <= 0 || precioUnitario <= 0) {
            JOptionPane.showMessageDialog(this, "Cantidad y precio unitario deben ser valores positivos.", "Dato inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double precioTotalPrenda = cantidad * precioUnitario;
        double porcentajeDescuento = rbHombre.isSelected() ? DESCUENTO_HOMBRE : DESCUENTO_MUJER;
        double montoDescuento = precioTotalPrenda * porcentajeDescuento;
        double precioNetoPrenda = precioTotalPrenda - montoDescuento;

        modeloTabla.addRow(new Object[]{
            descripcion,
            df.format(cantidad),
            df.format(precioUnitario),
            df.format(precioTotalPrenda),
            (porcentajeDescuento * 100) + "%",
            df.format(precioNetoPrenda)
        });

        actualizarTotales();
        limpiarFormulario();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void actualizarTotales() {
        double sumaPrecioNeto = 0.0;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String valor = modeloTabla.getValueAt(i, 5).toString().replace(",", "");
            sumaPrecioNeto += Double.parseDouble(valor);
        }
        double precioTotalConIva = sumaPrecioNeto * (1 + IVA);
        txtPrecioNeto.setText(df.format(sumaPrecioNeto));
        txtPrecioTotal.setText(df.format(precioTotalConIva));
    }
    
    
    private void limpiarFormulario() {
        txtDescripcion.setText("");
        txtCantidad.setText("");
        txtPrecioUnitario.setText("");
        buttonGroup1.clearSelection();
        txtDescripcion.requestFocus();
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
        java.awt.EventQueue.invokeLater(() -> new Examen_AlejandroMoraB().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelPrecioNeto;
    private javax.swing.JLabel jLabelPrecioTotal;
    private javax.swing.JLabel jLabelPrecioUnitario;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelTotales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecioNeto;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JTextField txtPrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
