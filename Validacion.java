public class Validacion{
    public static boolean validarEntero(String str){
        return str != null && str.matches("[-+]?\\d*\\d+");
    }
    public static boolean validarConsonante(String str){
        return str != null && str.matches("[SN]{1}");
    }
}
