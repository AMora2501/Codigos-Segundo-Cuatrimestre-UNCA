//cuenta padre
package cuentaBancaria;
public abstract class cuenta implements Notificaciones{
    
    protected String titular;
    protected double saldo;
    protected TipodeCuenta tipo;

    public cuenta(String titular, double saldo, TipodeCuenta tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public abstract void aplicarIVA();
    
    
    public TipodeCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipodeCuenta tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
