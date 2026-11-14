package Carrito;
import java.util.ArrayList; //Para listas dinamicas
import Producto.Product;   //Para manejarse con los productos
public class Carrito{

    // * Atributos
    //atributo para La lista que guarda los cosas del carrito
    public ArrayList<itemCarrito> listaCompras;
    public double totalCarrito; //variable para calcular el precio de las cosas

    // * constructor
    //iniciar vacio el carrito
    public Carrito() {
        this.listaCompras = new ArrayList<>();
    }

    public void agregarProductos(Product productoNuevo, int cantidad){

        //ver si existe el producto o no
        for (itemCarrito item : listaCompras){

            //comparar el código del producto en la lista con el del producto nuevo
            if (item.getProduct().productId == productoNuevo.productId) {

                // si ya hay un producto igual aumentar a la cantidad que ya tiene
                item.increaseQuantity(cantidad);
                return;

            }
        }
        itemCarrito nuevoItem = new itemCarrito(productoNuevo, cantidad);
        listaCompras.add(nuevoItem);

    }

    // * metodos
    //Vaciar el carrito
    public void vaciarCarrito() {
        this.listaCompras.clear();

    }

    //Calcular total en el carrito
    public double calcularTotal() {
        double total = 0;
            
        for (itemCarrito item : this.listaCompras) {
            total += item.getSubTotal();
        }
        return total;
        
    }

    public ArrayList<itemCarrito> getListaCompras() {
        return this.listaCompras;

    }
}
