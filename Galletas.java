public class Galletas implements Product{

    @Override
    public int getPrecio(){
        return 1700;
    }

    @Override
    public int getCalorias(){
        return 150;
    }

    @Override
    public int getCantidadGramos(){
        return 40;
    }

    @Override
    public void fabricar(){
        System.out.println("Fabricando galleta");
    }

    @Override
    public void entregar(){
        System.out.println("Entregando galleta");
    }

    
}
