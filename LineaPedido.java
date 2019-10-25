
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *  @autor Ibai Monleón Elía
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;

    /**
     * Constructor  
     */
    public LineaPedido(Producto producto, int cantidad)    {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * accesor para el producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public LineaPedido obtenerCopia() {
        Producto copiaProducto = producto.obtenerCopia();
        LineaPedido lineaPedido = new LineaPedido(copiaProducto, cantidad);
        return lineaPedido;
    }

    /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString() {
        String aux = producto.toString();
        String aux1 = String.format("%s | %4d unidades", aux, cantidad);
        return aux1;
    }
}
