package mx.edu.utng.state2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Jose Antonio Enrique on 14/09/2016.
 */
public class Lienzo extends View{

    private Pedal estado;
    private Automovil automovil;

    public Lienzo(Context context, Pedal estado, Automovil auto) {
        super(context);
        this.estado = estado;
        this.automovil = auto;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (estado != null && automovil!= null) {
            automovil.setCanvas(canvas);
            estado.presionarPedal(automovil, canvas);
        }
    }

    public Pedal getEstado() {
        return estado;
    }

    public void setEstado(Pedal estado) {
        this.estado = estado;
    }
}

