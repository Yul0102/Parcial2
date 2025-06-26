public class Main {
    public static void main(String[] args) {


        //precio
        ProductFactory factory = new BakeryFactory();
        Product p1 = factory.crearProducto("galleta");
        Product p2 = factory.crearProducto("ponque");

        int total = p1.getPrecio() + p2.getPrecio();
        System.out.println("Precio total de la orden: $" + total);

        //gramos
        ProductFactory bakery = new BakeryFactory();
        ProductFactory dairy = new DairyFactory();
        
        Product p3 = bakery.crearProducto("pan");
        Product p4 = dairy.crearProducto("yogurt");

        int totalGramos = p3.getCantidadGramos() + p4.getCantidadGramos();
        System.out.println("Cantidad total en gramos: " + totalGramos);

    }
}

