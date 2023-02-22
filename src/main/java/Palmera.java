public class Palmera extends Arbol{
    //extends=hereda no hace falta heredar los métodos
    private String nombre;

    public Palmera(TipoHoja tipoHoja,String altura){
        super(tipoHoja,altura);
        this.nombre=nombre;

    }

    public boolean podar(Boolean podado){
        if(podado=true){


            System.out.println("Esta podado");
            return true;

        }
        System.out.println("No esta podado");
        return false;
    }

    @Override
    public String florecer(){
        return "He florecido";

    }

    @Override
    public boolean morir() {
        return true;
    }



}
