public class Pan implements Product {

    @Override
    public int getPrecio(){
        return 1500;
    }

    @Override
    public int getCalorias(){
        return 120;
    }

    @Override
    public int getCantidadGramos(){
        return 35;
    }

    @Override
    public void fabricar(){
        System.out.println("Fabricando pan");
    }

    @Override
    public void entregar(){
        System.out.println("Entregando pan");
    }
    
}
