package modelos;

public class Dispensador10Mil implements CadenaDispensamiento {
    private final int DENOMINACION = 10000;
    private CadenaDispensamiento siguiente;

    @Override
    public void asignarSiguiente(CadenaDispensamiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(Denominacion denominacion) {
        int cantidad = denominacion.getCantidad();
        int billetes = cantidad / DENOMINACION;
        int sobrante = cantidad % DENOMINACION;

        if (billetes > 0) {
            System.out.println("Dispensando " + billetes + " billetes de $" + DENOMINACION + "  " + cantidad);
        }

        if (sobrante > 0 && siguiente != null) {
            siguiente.dispensar(new Denominacion(sobrante));
        }
    }

}
