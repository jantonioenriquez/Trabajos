package mx.edu.utng.state2;

import android.graphics.Canvas;

/**
 * Created by Jose Antonio Enrique on 14/09/2016.
 */
public class Automovil {
    private Pedal estado;
    private Canvas canvas;

    public Automovil(Pedal estado) {
        this.estado = estado;
    }

    public void presionarBoton() {
        estado.presionarPedal(this, canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Pedal getEstado() {
        return estado;
    }

    public void setEstado(Pedal estado) {
        this.estado = estado;
    }
}

