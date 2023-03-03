import modelos.CajeroAutomatico;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CajeroAutomatico cajero = new CajeroAutomatico();
        cajero.dispensar(23000);
    }
}
