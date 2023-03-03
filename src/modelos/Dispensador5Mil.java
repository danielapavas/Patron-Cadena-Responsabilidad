package modelos;

public class Dispensador5Mil implements CadenaDispensamiento {
    private final int DENOMINACION = 5000;
    private CadenaDispensamiento siguiente;

    @Override
    public void asignarSiguiente(CadenaDispensamiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(Denominacion denominacion) {
        int cantidad = denominacion.getCantidad();
        if (cantidad % DENOMINACION != 0) {
            System.out.println(
                    "No se puede dispensar la cantidad solicitada. La cantidad debe ser múltiplo de " + DENOMINACION);
            return;
        }
        if (cantidad >= DENOMINACION) {
            int numBilletes = cantidad / DENOMINACION;
            System.out.println("Dispensando " + numBilletes + " billetes de " + DENOMINACION + "  " + cantidad);
        }
    }

}
