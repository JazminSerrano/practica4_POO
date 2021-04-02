import java.util.*;

public class Entrada{
    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
    public static String capturarSNMenu(String msg){
        String opcion="";
        do{
            opcion = capturarCadena(msg);
            if(!Validacion.validarConsonante(opcion))
                System.out.print("Ingrese una S para si y una N para no.\n");
        }while(!Validacion.validarConsonante(opcion));
        return opcion;
    }
    public static int capturarOpcionMenu(String msg,int numOp){
        String opcion="";
	    System.out.print(msg+"\n");
        do{
            opcion = capturarCadena("Opcion");
            if(!Validacion.validarEntero(opcion)||Integer.parseInt(opcion)>numOp)
                System.out.print("Ingrese una opcion numerica del menu.\n");
        }while(!Validacion.validarEntero(opcion)||Integer.parseInt(opcion)>numOp);
        return (Integer.parseInt(opcion));
    }
}
