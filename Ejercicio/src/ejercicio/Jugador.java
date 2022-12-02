
package ejercicio;


public class Jugador {
    int vida;
    int dinero;
    int suerte;
    
    public Jugador(){
        
    }

    public Jugador(int vida, int dinero, int suerte) {
        this.vida = vida;
        this.dinero = dinero;
        this.suerte = suerte;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }
    
    
}
