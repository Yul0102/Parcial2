public class BakeryFactory implements ProductFactory {

    @Override
    public Product crearProducto(String tipo) {
        
        return switch (tipo.toLowerCase()) {
            case "galleta" -> new Galletas();
            case "ponque" -> new Ponque();
            case "pan" -> new Pan();
            default -> throw new IllegalArgumentException("Tipo desconocido: " + tipo);
        };
    }
}