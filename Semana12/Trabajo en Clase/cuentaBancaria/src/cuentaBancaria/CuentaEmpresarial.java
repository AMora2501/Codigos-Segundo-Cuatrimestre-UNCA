package cuentaBancaria;
import javax.swing.JOptionPane;
public class CuentaEmpresarial extends cuenta {

    public CuentaEmpresarial(String titular, double saldo) {
        super(titular, saldo, TipodeCuenta.EMPRESARIAL);
    }

    @Override
    public void enviarNoti(String mensaje) {
        JOptionPane.showMessageDialog((null), "Estas en la cuente empresarial " + titular + " " + mensaje);
    }
    
    @Override
        public void aplicarIVA() {
        double IVA = saldo + tipo.getTasaInteres();
        saldo = saldo + IVA;
        enviarNoti("Se aplico el interes "+ saldo);
    }
}
