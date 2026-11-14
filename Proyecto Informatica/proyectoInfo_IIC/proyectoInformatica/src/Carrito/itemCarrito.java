package Carrito;
import Producto.Product;
public class itemCarrito {

    // * atributos
    private Product PR; //PR = producto | cambiar luego
    private int amount;

    // * constructor
    public itemCarrito(Product PR, int amount){
        this.PR = PR;
        this.amount = amount;
    }

    // * Metodos
    //obtener productos
    public Product getProduct(){
        return this.PR;
    }

    //Obtener canitidad de productos
    public int getProductQuantity(){
        return this.amount;

    }

    //metodo por si vuelven a poner el mismo producto
    public void increaseQuantity(int amount) {
        this.amount += amount;
    }
    
    //metodo de cálculo: multiplicar el precio del producto por la cantidad
    public double getSubTotal(){
        return this.PR.productPrice * this.amount;

    }
}
