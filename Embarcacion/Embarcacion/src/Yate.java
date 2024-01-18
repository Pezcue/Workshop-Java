public class Yate extends Embarcacion {
    private final int camarote;
    private final boolean necesitaReparacion;
    
    public Yate(int anoFabricacion, double longitud, int camarote, boolean necesitaReparacion, Capitan capitan) {
        super(anoFabricacion, longitud, capitan);
        this.camarote = camarote;
        this.necesitaReparacion = necesitaReparacion;
    }

    public boolean esLujoso() {
        boolean lujosidad;
        if (camarote > 7) {
            lujosidad = true;
            System.out.println("El yate es lujoso.");
        } else {
            lujosidad = false;
            System.out.println("El yate no es lujoso.");
        }
        return lujosidad;
    }

    public boolean esVendible() {
        return getAnoFabricacion() > 2010 && getPrecioBase() > 1000 && !necesitaReparacion;
    }
}
