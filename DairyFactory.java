public class DairyFactory implements ProductFactory {

    @Override
    public Product crearProducto(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "yogurt" -> new Yogurt();
            default -> throw new IllegalArgumentException("Tipo desconocido: " + tipo);
        };
    }
}
