
/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * @autor Ibai Monleón Elía
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente, 
    LineaPedido linea1, LineaPedido linea2)    {
        this.fecha = fecha;
        this.cliente = cliente;
        this.linea1 = linea1;
        this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() {
        Producto producto1 = linea1.getProducto();
        double precio1 = producto1.getPrecio() * linea1.getCantidad();
        Producto producto2 = linea2.getProducto();
        double precio2 = producto2.getPrecio() * linea2.getCantidad();
        return precio1 + precio2;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
        return getImporteAntesIva() * IVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
        return getImporteAntesIva() + getIva();
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String auxFecha = "FECHA PEDIDO: " + fecha + "\nDATOS CLIENTE\n";
        String auxPedido = "\n**** Artículos en el pedido ****\n";
        String auxPagar = "\n**** A pagar ****\n";
        String auxAntesIva = String.format("%20s %8.2f€", "IMPORTE SIN IVA:", getImporteAntesIva()); 
        String auxIva = String.format("%20s %8.2f€", "IVA:", getIva()); 
        String auxTotal = String.format("%20s %8.2f€", "IMPORTE TOTAL:", getImporteTotal()); 
        return auxFecha + cliente + auxPedido + linea1 + linea2 + auxPagar + auxAntesIva + auxIva + auxTotal;
    }

    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
        Fecha fechaOtra = otro.getFecha();
        return fecha.getYear() < fechaOtra.getYear() || fecha.getYear() == fechaOtra.getYear() && fecha.getMes() < fechaOtra.getMes() ||
            fecha.getYear() == fechaOtra.getYear() && fecha.getMes() == fechaOtra.getMes() && fecha.getDia() < fechaOtra.getDia();
    }

    /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        Pedido pedido = new Pedido(fecha, cliente, linea1, linea2);
        return pedido;
    }

}
