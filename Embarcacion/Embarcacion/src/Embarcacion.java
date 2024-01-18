public class Embarcacion {

    // Atributos
    private final double precioBase = 30000;

    private final int anoFabricacion;
    private final double longitud;
    private Capitan capitan;

    //Construtor
    public Embarcacion(int anoFabricacion, double longitud, Capitan capitan) {
        this.anoFabricacion = anoFabricacion;
        this.longitud = longitud;
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    //Métodos

    public double calcularAlquiler(){
        double valorAdicional = 20000;
        double alquiler = precioBase;
        if (anoFabricacion > 2020) {
            alquiler = precioBase + valorAdicional;
        }
        return alquiler;
    }

}
