
package ejercicio;

import java.util.*;
public class Ejercicio {

    
    public static void main(String[] args) {
        Scanner ObiWan = new Scanner(System.in);
        ArrayList<Jugador> Jugador = new ArrayList<Jugador>();
        int vida = 1000;
        int dinero = 10000;
        System.out.println("¡Hola! En este programa podrás ingresar la suerte de los jugadores que quieras.");
        int stop = 1;
        while(stop!=0){
            System.out.println("Porfavor, ingresa la suerte del jugador del 1 al 10: ");
            int suerte = ObiWan.nextInt();
            if(suerte <= 10){
                Jugador jugador = new Jugador(vida,dinero,suerte);
                Jugador.add(jugador);
                System.out.println("Quiere seguir ingresando jugadores? Si = 1, No = 0");
                ObiWan = new Scanner(System.in);
                stop = ObiWan.nextInt();
                if (stop>1) {
                    System.out.println("Ingrese numero valido");
                    stop=0;
                }
            }else{
                System.out.println("Porfavor, ingresa un numero valido.");
            }
        }
        for (int i = 0; i < Jugador.size(); i++) {
            Jugador temp = Jugador.get(i);
            System.out.println("El jugador "+i+" tiene "+temp.getVida()+" de vida.");
            
            }
        
        
        System.out.println("¿Desea ver el resto de los atributos? (S para si, N para no)");
        String deci = ObiWan.next();
        if(deci.equalsIgnoreCase("S")){
            System.out.println("¿Desea verlos todos o solo uno? (T para todos, U para uno)");
            String deci2 = ObiWan.next();
            if (deci2.equalsIgnoreCase("T")) {
                for (int i = 0; i < Jugador.size(); i++) {
                    Jugador temp = Jugador.get(i);
                    System.out.println("El jugador "+i+" tiene "+temp.getDinero()+" de dinero.");
                    System.out.println("El jugador "+i+" tiene "+temp.getSuerte()+" de suerte.");
                 }
            }else if(deci2.equalsIgnoreCase("U")){
                System.out.println("¿Que desea ver? (D para dinero, X para suerte)");
                String deci3 = ObiWan.next();
                if (deci3.equalsIgnoreCase("D")) {
                    for (int i = 0; i < Jugador.size(); i++) {
                    Jugador temp = Jugador.get(i);
                    System.out.println("El jugador "+i+" tiene "+temp.getDinero()+" de dinero.");
                 }
                }else if(deci3.equalsIgnoreCase("X")){
                    for (int i = 0; i < Jugador.size(); i++) {
                    Jugador temp = Jugador.get(i);
                    System.out.println("El jugador "+i+" tiene "+temp.getSuerte()+" de suerte.");
                 }
                }else{
                    System.out.println("Favor ingresa datos correctos");
                }
                System.out.println("¿Desea ver el otro?(S para si, N para no)");
                String deci4 = ObiWan.next();
                if (deci4.equalsIgnoreCase("S")) {
                    if(deci3.equalsIgnoreCase("D")){
                        for (int i = 0; i < Jugador.size(); i++) {
                    Jugador temp = Jugador.get(i);
                    System.out.println("El jugador "+i+" tiene "+temp.getSuerte()+" de suerte.");
                    }
                    }else if(deci3.equalsIgnoreCase("X")){
                        for (int i = 0; i < Jugador.size(); i++) {
                            Jugador temp = Jugador.get(i);
                            System.out.println("El jugador "+i+" tiene "+temp.getDinero()+" de dinero.");
                         }
                    }else{
                        System.out.println("Favor ingresa datos correctos");
                    }
                }
            }else{
                System.out.println("Favor ingresa datos correctos");
            }
        }else if(deci.equalsIgnoreCase("N")){
            System.out.println("¡Bye!");
        }else{
            System.out.println("Favor ingrese un dato correcto");
        }
    }
    
}
