package modelos;

public class CajeroAutomatico {
    private CadenaDispensamiento dispensador;

    public CajeroAutomatico() {
        this.dispensador = new Dispensador100Mil();
        CadenaDispensamiento dispensador50Mil = new Dispensador50Mil();
        CadenaDispensamiento dispensador20Mil = new Dispensador20Mil();
        CadenaDispensamiento dispensador10Mil = new Dispensador10Mil();
        CadenaDispensamiento dispensador5Mil = new Dispensador5Mil();

        this.dispensador.asignarSiguiente(dispensador50Mil);
        dispensador50Mil.asignarSiguiente(dispensador20Mil);
        dispensador20Mil.asignarSiguiente(dispensador10Mil);
        dispensador10Mil.asignarSiguiente(dispensador5Mil);
    }

    public void dispensar(int cantidad) {
        dispensador.dispensar(new Denominacion(cantidad));
    }

}
