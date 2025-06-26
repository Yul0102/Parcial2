public class Yogurt implements Product {

    @Override
    public int getPrecio() { 
        return 1300; 
    }

    @Override
    public int getCalorias() { 
        return 110; 
    }

    @Override
    public int getCantidadGramos() { 
        return 200; 
    }

    @Override
    public void fabricar() { 
        System.out.println("Fabricando yogurt..."); 
    }

    @Override
    public void entregar() { 
        System.out.println("Entregando yogurt."); 
    }
}

