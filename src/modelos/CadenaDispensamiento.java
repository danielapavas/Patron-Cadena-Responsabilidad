package modelos;

public interface CadenaDispensamiento {

    void asignarSiguiente(CadenaDispensamiento siguiente);

    void dispensar(Denominacion denominacion);

}
