package mx.edu.utng.state2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout layPrincipal;
    private ImageButton btnCambio;
    private Lienzo lienzo;

    private Frenado estadoInicial;
    private Automovil auto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnCambio = (ImageButton)findViewById(R.id.btn_pedal);
        estadoInicial = new Frenado();
        auto = new Automovil(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, auto);
        layPrincipal.addView(lienzo);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzo.setEstado(auto.getEstado());
                auto.presionarBoton();
                lienzo.invalidate();
            }
        });

    }
}
