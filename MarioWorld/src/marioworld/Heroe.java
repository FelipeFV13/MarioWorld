package marioworld;

public class Heroe {

    private int vidas = 3;
    private int posicion = 0;
    private String nombre;
    private boolean saltando = false;
   
    public Heroe(String nombre){
        this.nombre = nombre;
    }
   
    public String getNombre(){
        return this.nombre;
    }
   
    public int getVidas(){
        return this.vidas;
    }
   
    public int getPosicion(){
       
        return this.posicion;
    }
   
    public boolean getSaltar(){
        return this.saltando;
    }
   
    public void setVidas(){
        System.out.println(this.nombre +" Ha perdido una vida.");
        this.vidas -= 1;
    }
   
    public void setPosicion(){
        System.out.println(this.nombre +" se ha movido.");
        this.saltando = false;
        this.posicion += 1;
       
       
       
    }
   
    public void setSaltando(){
        this.saltando = true;
        this.posicion += 1;
        System.out.println(this.nombre + " ha saltado ");
       
    }
}
