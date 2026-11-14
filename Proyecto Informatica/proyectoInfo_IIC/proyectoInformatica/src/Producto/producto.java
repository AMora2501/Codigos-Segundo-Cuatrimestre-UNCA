package Producto;
public class producto {

    // * Atributos + ejemplos
   public String productName;   //Nombre Producto: Leche entera
   public String productType;   //Tipo producto: Lacteo
   public int productId;        //Id producto: 1 08865 2
   public double productPrice;  //Precio 1500
   public double IVA;           //IVA

    // * Constructor
    public producto(String productName, String productType, int productId, double productPrice, double IVA){
        this.productName = productName;
        this.productType = productType;
        this.productId = productId;
        this.productPrice = productPrice;
        this.IVA = productPrice * 2;

    }

    // * Metodos
    public String getNombreProducto(){
        return this.productName;

    }

    public String getTipoProducto(){
        return this.productType;

    }

    public int getIdProducts() {
        return this.productId;

    }

    public double getPrecioProducto(){
        return this.productPrice;

    }  

    public double getIVA(){
        return this.IVA;

    }
}
