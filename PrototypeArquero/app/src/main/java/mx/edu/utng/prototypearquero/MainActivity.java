package mx.edu.utng.prototypearquero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private EditText edtNombre;
    private EditText edtAtaque;
    private EditText edtDefensa;
    private Button btnClonar;
    private GridView grvArquero;
    private ArrayList<Arquero> arqueros;
    private Arquero arquero;
    private ArqueroAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = (EditText) findViewById(R.id.edt_nombre);
        edtAtaque = (EditText) findViewById(R.id.edt_ataque);
        edtDefensa = (EditText) findViewById(R.id.edt_defensa);

        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvArquero = (GridView)findViewById(R.id.grv_arquero);
        arqueros = new ArrayList<Arquero>();
        arquero = new Arquero();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arquero.setNombre(edtNombre.getText().toString());
                arquero.setAtaque(edtAtaque.getText().toString());
                arquero.setDefensa(edtDefensa.getText().toString());


                Arquero clon = (Arquero) arquero.clonar();

                arqueros.add(clon);

                adapter = new ArqueroAdapter(
                        MainActivity.this, arqueros);
                grvArquero.setAdapter(adapter);
            }
        });
    }
}
