
/**
 *  Clase para probar el resto de clases
 *  @autor Ibai Monleón Elía
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // crear pedido1
        Fecha fecha1 = new Fecha( 4, 9, 2019);
        Cliente cliente1 = new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra");
        Producto productoUno1 = new Producto("Rotulador fosforescente",6.70);
        Producto productoDos1 = new Producto("Memoria USB 64GB",14.80);
        LineaPedido lineaUno1 = new LineaPedido(productoUno1, 20);
        LineaPedido lineaDos1 = new LineaPedido(productoDos1, 10);
        pedido1 = new Pedido(fecha1, cliente1, lineaUno1, lineaDos1);
        // crear pedido2
        Fecha fecha2 = new Fecha( 8, 10, 2019);
        Cliente cliente2 = new Cliente("Elisa Nuin", "C/ Río Alzania 7", "Pamplona", "Navarra");
        Producto productoUno2 = new Producto("Sacapuntas manual",16.64);
        Producto productoDos2 = new Producto("Corrector tippex",5.99);
        LineaPedido lineaUno2 = new LineaPedido(productoUno2, 8);
        LineaPedido lineaDos2 = new LineaPedido(productoDos2, 20);
        pedido2 = new Pedido(fecha2, cliente2, lineaUno2, lineaDos2);
    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.println("Pedido 1\n--------------------\n" + pedido1.toString() + "\n");
        System.out.println("Pedido 2\n--------------------\n"+ pedido2.toString() + "\n");
        if (pedido1.masAntiguoQue(pedido2)){
            System.out.println("El pedido 1 se ha realizado antes que el pedido 2");
        } else {
            System.out.println("El pedido 2 se ha realizado antes que el pedido 1");
        }
    }
}
