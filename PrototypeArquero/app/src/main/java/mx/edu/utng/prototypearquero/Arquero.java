package mx.edu.utng.prototypearquero;

/**
 * Created by Jose Antonio Enrique on 17/09/2016.
 */
public class Arquero implements Clonable {
    private String nombre;
    private String ataque;
    private String defensa;

    public Arquero(){
        this.nombre = "";
        this.ataque = "";
        this.defensa = "";
    }

    public Arquero(String nombre, String ataque, String defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    @Override
    public Clonable clonar() {
        Arquero clon = new Arquero(nombre, ataque, defensa);
        return clon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }

    public String getDefensa() {
        return defensa;
    }
}
