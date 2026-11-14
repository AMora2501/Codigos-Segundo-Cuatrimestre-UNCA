package cuentaBancaria;
public class inicio {
    public static void main(String[] args) {

        cuenta c1 = new CuentaAhorros("ale", 100.2);
        cuenta c2 = new CuentaCorriente("fe", 100.2);
        cuenta c3 = new CuentaEmpresarial("franle", 100.2);
        
        c1.aplicarIVA();
    }
}
