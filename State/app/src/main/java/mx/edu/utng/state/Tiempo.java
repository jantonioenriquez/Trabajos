package mx.edu.utng.state;

/**
 * Created by Jose Antonio Enrique on 12/09/2016.
 */
import android.graphics.Canvas;

public class Tiempo {
    private Estado estado;
    private Canvas canvas;

    public Tiempo(Estado estado){
        this.estado = estado;
    }

    public void presionarBoton(){
        estado.Cambio(this, canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
