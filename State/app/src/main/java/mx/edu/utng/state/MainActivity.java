package mx.edu.utng.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layPrincipal;
    private ImageButton btnSwitch;
    private Lienzo lienzo;

    private Noche estadoInicial;
    private Tiempo tiempo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnSwitch = (ImageButton)findViewById(R.id.btn_switch);
        estadoInicial = new Noche();
        tiempo = new Tiempo(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, tiempo);
        layPrincipal.addView(lienzo);

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzo.setEstado(tiempo.getEstado());
                tiempo.presionarBoton();
                lienzo.invalidate();
            }
        });

    }
}