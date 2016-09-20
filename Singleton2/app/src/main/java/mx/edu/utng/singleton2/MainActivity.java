package mx.edu.utng.singleton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumero;
    private EditText edtFecha;
    private EditText edtTotal;

    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero=(EditText)findViewById(R.id.edt_numero);
        edtFecha =(EditText)findViewById(R.id.edt_fecha);
        edtTotal =(EditText)findViewById(R.id.edt_total);

        btnCrear = (Button)findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Venta venta = Venta.getVenta();
                venta.setNumVenta(Integer.parseInt(edtNumero.getText().toString()));
                venta.setFechaVenta(edtFecha.getText().toString());
                venta.setTotalVenta(Float.parseFloat(edtTotal.getText().toString()));

                Toast.makeText(MainActivity.this, "Usuario creado: " +
                                "\nNimero de venta: " + venta.getNumVenta()
                                + "\nFecha: " + venta.getFechaVenta()
                                + "\nTotal: " + venta.getTotalVenta(),

                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
