package mx.edu.utng.prototype;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtMarca;
    private EditText edtColor;
    private Button btnClonar;
    private GridView grvRelojes;
    private ArrayList<Reloj> relojs;
    private Reloj reloj;
    private RelojAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMarca = (EditText) findViewById(R.id.edt_marca);
        edtColor = (EditText) findViewById(R.id.edt_color);

        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvRelojes = (GridView)findViewById(R.id.grv_relojes);
        relojs = new ArrayList<Reloj>();
        reloj = new Reloj();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reloj.setMarca(edtMarca.getText().toString());
                reloj.setColor(edtColor.getText().toString());

                Reloj clon = (Reloj) reloj.clonar();

                relojs.add(clon);

                adapter = new RelojAdapter(
                        MainActivity.this, relojs);
                grvRelojes.setAdapter(adapter);
            }
        });
    }
}

