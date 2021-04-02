import java.util.*;

public class Pajaro{
    String nombre;
    int danio;
    int destructometro;
    int nivel;
    int plumas;
    int multiplicador;

    public Pajaro(String nombre,int multiplicador){
        setNombre(nombre);
        iniciarNivel();
        iniciarPlumas();
        setMultiplicador(multiplicador);
    }

    public void iniciarDestructometro(){
        destructometro=0;
    }
    public void iniciarNivel(){
        nivel=1;
    }
    public void iniciarPlumas(){
        plumas=0;
    }
    public void generarDanio(){
        Random gen = new Random();
        danio = gen.nextInt(100);
    }

    public void setNivel(int nivel){
        this.nivel+=nivel;
    }
    public void setPlumas(int plumas){
        this.plumas+=plumas;
    }
    public void setDestructometro(){
        destructometro+=danio;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setMultiplicador(int multiplicador){
        this.multiplicador=multiplicador;
    }

    public int getNivel(){
        return nivel;
    }
    public int getPlumas(){
        return plumas;
    }
    public int getDestructometro(){
        return destructometro;
    }
    public String getNombre(){
        return nombre;
    }
    public int getMultiplicador(){
        return multiplicador;
    }

    public void disparar(){
        System.out.print(nombre+" ha sido disparado\n");
    }
    public void activarAtaqueEspecial(){
        generarDanio();
        danio*=multiplicador;
        System.out.print(nombre+" ha activado su ataque especial, ocasionará x"+multiplicador+" de daño\n");
    }
    public void atacar(){
        System.out.print(nombre+" ha generado un daño de "+danio+"\n");
    }
}
