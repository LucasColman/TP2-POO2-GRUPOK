public class App {
    public static void main(String[] args) throws Exception {

        Obsoleto miObjeto = new Obsoleto();
        // Llamada al método obsoleto (se mostrará una advertencia)
        miObjeto.viejoMetodo();
        
        // Llamada al método nuevo (el recomendado)
        miObjeto.nuevoMetodo();
    }     
}
