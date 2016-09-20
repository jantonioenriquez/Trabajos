package mx.edu.utng.state2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Jose Antonio Enrique on 14/09/2016.
 */
public class Frenado extends Pedal {
    @Override
    public void presionarPedal(Automovil automovil, Canvas canvas) {
        automovil.setEstado(new Acelerado());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);

        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;

        Path path = new Path();
        path.moveTo(mitadX*0.1f, mitadY*0.6f);
        path.lineTo(mitadX * 0.05f, mitadY);
        path.lineTo(mitadX * 0.05f, mitadY * 1.5f);
        path.lineTo(mitadX * 1.75f, mitadY * 1.5f);
        path.lineTo(mitadX * 1.75f, mitadY);
        path.lineTo(mitadX * 1.4f, mitadY);
        path.lineTo(mitadX, mitadY*0.6f);
        path.lineTo(mitadX*0.5f, mitadY*0.6f);
        path.close();

        canvas.drawPath(path, paint);


        paint.setColor(Color.CYAN);
        canvas.drawRect(mitadX*.20f, mitadY*.67f, mitadX*.80f,mitadY,paint);

        paint.setColor(Color.BLACK);
        canvas.drawCircle(mitadX*0.5f,mitadY*1.5f,60f,paint);

        paint.setColor(Color.BLACK);
        canvas.drawCircle(mitadX*1.25f,mitadY*1.5f,60f,paint);

        paint.setColor(Color.GRAY);
        canvas.drawCircle(mitadX*0.5f,mitadY*1.5f,30f,paint);

        paint.setColor(Color.GRAY);
        canvas.drawCircle(mitadX*1.25f,mitadY*1.5f,30f,paint);

        paint.setColor(Color.rgb(10,200,20));
        canvas.drawRect(0, mitadY*1.7f, mitadX*2f,mitadY*2.0F,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(mitadX*2f,mitadY*0.15f,40f,paint);
    }
}

