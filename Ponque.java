public class Ponque implements Product{
    
    @Override
    public int getPrecio(){
        return 2100;
    }

    @Override
    public int getCalorias(){
        return 232;
    }

    @Override
    public int getCantidadGramos(){
        return 60;
    }

    @Override
    public void fabricar(){
        System.out.println("Fabricando ponque");
    }

    @Override
    public void entregar(){
        System.out.println("Entregando ponque");
    }
    
}
