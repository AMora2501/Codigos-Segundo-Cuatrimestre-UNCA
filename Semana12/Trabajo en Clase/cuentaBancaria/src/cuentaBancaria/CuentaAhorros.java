
package cuentaBancaria;

public class CuentaAhorros extends cuenta{
    
    public CuentaAhorros(String titular, double saldo) {
            super(titular, saldo, TipodeCuenta.AHORROS);
    }
    
    @Override
    public void enviarNoti(String mensaje){
        System.out.println("Estan en la cuenta de ahorros " + titular + " " + mensaje);
    }

    @Override //sirve para decir que ya existe pero se esta reescribiendo
    public void aplicarIVA() {
        double IVA = saldo + tipo.getTasaInteres();
        saldo = saldo + IVA;
        enviarNoti("Se aplico el interes "+ saldo);
    }
    
    
}