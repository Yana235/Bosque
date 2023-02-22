public enum TipoHoja {

    PERENNE("Hoja perenne,no se cae"),
    CADUCA("Hoja caduca,se cae");

    private final String tipoHoja;

    //Los constructores de los enums son  siempre privados
   private TipoHoja(String tipoHoja){
        this.tipoHoja=tipoHoja;
    }

    @Override
    public String toString() {
        return "TipoHoja{" +
                "tipoHoja='" + tipoHoja + '\'' +
                '}';
    }
}
