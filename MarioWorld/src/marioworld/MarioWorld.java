
package marioworld;

import java.util.Scanner;

public class MarioWorld {

    public static void main(String[] args) {
        char tecla;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de tu heroe: "+"\n");
        String nameHero = input.nextLine();
       
        Heroe myHero = new Heroe(nameHero);
       
        System.out.println("Hola me llamo "+myHero.getNombre()+"¡, Here we go!\n");
       
        System.out.println("Usa D para moverte y S para saltar\n");
       
        do {
           
            if( myHero.getPosicion() % 10 == 0){
                System.out.println("Hay un enemigo en el camino");
                tecla = input.next().charAt(0);
                switch (Character.toString(tecla)) {
                    case "d":
                        myHero.setPosicion();
                        myHero.setVidas();
                        System.out.println("Has tomado una mala decision");
                        System.out.println(myHero.getNombre() + " te quedan "+ myHero.getVidas()+" vidas");
                        break;
                    case "s":
                        myHero.setSaltando();
                        System.out.println("Excelente has evadido al enemigo.");
                        break;
                    default:
                        throw new AssertionError();
                }
               
               
               
            }else{
                tecla = input.next().charAt(0);
               
                switch (Character.toString(tecla)) {
                    case "d":
                        myHero.setPosicion();
                        break;
                    case "s":
                        myHero.setSaltando();
                        break;
                    default:
                        throw new AssertionError();
                }
            }
           
           
        } while (myHero.getVidas()>0);
       
        System.out.println("\nGame Over");
    }
    
}
