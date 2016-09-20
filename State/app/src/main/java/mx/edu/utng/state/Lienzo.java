package mx.edu.utng.state;

/**
 * Created by Jose Antonio Enrique on 12/09/2016.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo extends View{

    private Estado estado;
    private Tiempo tiempo;

    public Lienzo(Context context, Estado estado, Tiempo tiempo){
        super(context);
        this.estado = estado;
        this.tiempo = tiempo;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado!=null&&tiempo!=null){
            tiempo.setCanvas(canvas);
            estado.Cambio(tiempo, canvas);
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}