public class AngryBirds{
	public static void jugar(Pajaro bird){
	    boolean bandera=true;
	    String opcion;
        bird.iniciarDestructometro();
        System.out.print("\nPara ganar debes llenar tu Destructometro, estadisticas:");
        System.out.print("\nNivel "+bird.getNivel()+"\nPlumas "+bird.getPlumas()+"\nDestructometro "+bird.getDestructometro()+"/1000\n\n");
        do{
            opcion = Entrada.capturarSNMenu("Disparar?(S/N)");
            switch(opcion){
            case "S":
                bird.disparar();
                opcion = Entrada.capturarSNMenu("Activar ataque especial?(S/N)");
                switch(opcion){
                case "S":
                    bird.generarDanio();
                    bird.activarAtaqueEspecial();
                    opcion = Entrada.capturarSNMenu("Atacar?(S/N)");
                    switch(opcion){
                    case "S":
                        bird.atacar();
                        bird.setDestructometro();
                        bird.setPlumas((int)(bird.getDestructometro()/100));
                        System.out.print("Destructometro "+bird.getDestructometro()+"/1000\n");
                        break;
                    case "N":
                        opcion = Entrada.capturarSNMenu("Desea salir?(S/N)");
                        if(opcion.matches("[S]{1}"))
                            bandera=false;
                        else
                            System.out.print("Perdio el ataque /(xOx)\\ \n");
                    }
                    break;
                case "N":
                    opcion = Entrada.capturarSNMenu("Atacar?(S/N)");
                    switch(opcion){
                    case "S":
                        bird.generarDanio();
                        bird.atacar();
                        bird.setDestructometro();
                        bird.setPlumas((int)(bird.getDestructometro()/100));
                        System.out.print("Destructometro "+bird.getDestructometro()+"/1000\n");
                        break;
                    case "N":
                        opcion = Entrada.capturarSNMenu("Desea salir?(S/N)");
                        if(opcion.matches("[S]{1}"))
                            bandera=false;
                        else
                            System.out.print("Perdio el ataque /(xOx)\\ \n");
                    }
                break;
                }
                break;
            case "N":
                opcion = Entrada.capturarSNMenu("Desea salir?(S/N)");
                if(opcion.matches("[S]{1}"))
                    bandera=false;
                break;
            }
        }while(bandera&&(bird.getDestructometro()<1000));
        if(bird.getPlumas()>100)
            bird.setNivel( (int)(bird.getPlumas()/100) );
        System.out.print("\nEstadisticas de "+bird.getNombre()+":");
        System.out.print("\nNivel "+bird.getNivel()+"\nPlumas "+bird.getPlumas()+"\n");
	}

	public static void main(String args[]){
	    int opcion;
	    Red red = new Red();
	    Blues JJyJ = new Blues();
	    Yellow chuck = new Yellow();
	    do{
            opcion = Entrada.capturarOpcionMenu("\nEscoge un pajaro para jugar\n1.Red\n2.Jay, Jake y Jim\n3.Chuck\n0.Salir\n",3);
            switch(opcion){
            case 1:
                jugar(red);
                break;
            case 2:
                jugar(JJyJ);
                break;
            case 3:
                jugar(chuck);
                break;
            }
	    }while(opcion!=0);
	}
}
