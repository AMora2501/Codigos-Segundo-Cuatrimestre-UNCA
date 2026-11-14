package cuentaBancaria;
public enum TipodeCuenta {
    
    AHORROS(0.03),
    CORRIENTE(0.0),
    EMPRESARIAL(0.15),;
    
    private final double tasaInteres;

    private TipodeCuenta(double tasaInteres) {
        this.tasaInteres = tasaInteres;
        
    }
    public double getTasaInteres(){
        return tasaInteres;
        
    }

}
