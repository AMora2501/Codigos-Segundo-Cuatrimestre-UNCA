package Producto;
public class Product {

    // * Atributos + ejemplos
   public String productName;   //Nombre Producto: Leche
   public String productType;   //Tipo producto: Lacteo
   public int productId;        //Id producto: 1 08865 2
   public double productPrice;  //Precio 1500
   public double IVA;           //IVA

    // * Constructor
    public Product(String productName, String productType, int productId, double productPrice, double IVA){
        this.productName = productName;
        this.productType = productType;
        this.productId = productId;
        this.productPrice = productPrice;
        this.IVA = productPrice * 0.13;

    }

    // * Metodos
    public String getProductName(){
        return this.productName;

    }

    public String getProductType(){
        return this.productType;

    }

    public int getIdProducts() {
        return this.productId;

    }

    public double getProductPrice(){
        return this.productPrice;

    }  

    public double getIVA(){
        return this.IVA;

    }
}
