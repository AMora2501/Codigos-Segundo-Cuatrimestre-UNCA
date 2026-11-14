package cuentaBancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author helle
 */
public class CuentaCorriente extends cuenta {

    public CuentaCorriente(String titular, double saldo) {
        super(titular, saldo, TipodeCuenta.CORRIENTE);
    }

    @Override
    public void enviarNoti(String mensaje) {
        JOptionPane.showMessageDialog((null), "Estas en la cuente corriente");
    }

    @Override
    public void aplicarIVA() {
        System.out.println("No aplica el interes");
    }

  
}