public abstract class Arbol implements SerVivo {

    //implements=coje metodos y atributos de cualquier interfaz(solo interfaz) pero si es abstracto no hace falta implemetar
//Al ser una clase abstracata no esta obligada a heredar pero el quwe herede de el si que esta
    private TipoHoja tipoHoja;
    //con protected se puede hacer qeu otras clases lo cojan
    private String altura;
    private boolean vivo;

    public Arbol(TipoHoja tipoHoja,String altura){
        super();
    this.altura=altura;
    this.tipoHoja=tipoHoja;
    vivo=true;
    }

    public void setTipoHoja(){

    }
@Override
    public void respirar(){
    System.out.println("respira");
}



public void serVivo(){

    }


public void hacerFotosintesis(){
    System.out.println("hacer fotosintesis");
}
public abstract String florecer();


    public boolean morir(){
        return false;
    }
}
