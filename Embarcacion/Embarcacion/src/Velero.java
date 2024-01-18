public class Velero extends Embarcacion {

    private final int mastiles;

    public Velero(int anoFabricacion, double longitud, int mastiles, Capitan capitan) {
        super(anoFabricacion, longitud, capitan);
        this.mastiles = mastiles;
    }

    public boolean medirTamano(){
        boolean tamano;
        tamano = mastiles > 4;
     return tamano; //
    }

}
