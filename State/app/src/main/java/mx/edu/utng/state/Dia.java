package mx.edu.utng.state;

/**
 * Created by Jose Antonio Enrique on 12/09/2016.
 */

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.EditText;

/**
 * Created by qas on 6/09/16.
 */
public class Dia extends Estado{

    @Override
    public void Cambio(Tiempo tiempo, Canvas canvas) {
        tiempo.setEstado(new Noche());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;
        canvas.drawRect(0.0f, mitadY*0.0f,
                mitadX*5.5f, mitadY*5.5f, paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(150,100,50.0f,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawRect(mitadX*.6f,mitadY*1.5f,mitadX*1.4f,mitadY*2.0f,paint);

        paint.setColor(Color.GRAY);
        Path path = new Path();


        path.moveTo(mitadX, mitadY);
        path.lineTo(mitadX*0.5f, mitadY*1.5f);
        path.lineTo(mitadX*1.5f, mitadY*1.5f);
        path.lineTo(mitadX, mitadY);
        path.close();

        canvas.drawPath(path, paint);

    }
}
