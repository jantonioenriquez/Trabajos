package mx.edu.utng.single;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtApellidos;
    private EditText edtEmail;
    private EditText edtContrasena;

    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre=(EditText)findViewById(R.id.edt_nombre);
        edtApellidos =(EditText)findViewById(R.id.edt_apellidos);
        edtEmail =(EditText)findViewById(R.id.edt_email);
        edtContrasena =(EditText)findViewById(R.id.edt_contrasena);
        btnCrear = (Button)findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario usuario = Usuario.getUsuario();
                usuario.setNombre(edtNombre.getText().toString());
                usuario.setApellidos(edtApellidos.getText().toString());
                usuario.setEmail(edtEmail.getText().toString());
                usuario.setContrasena(edtContrasena.getText().toString());

                Toast.makeText(MainActivity.this, "Usuario creado: " +
                                "\nNombre: " + usuario.getNombre()
                                + "\nApellidos: " + usuario.getApellidos()
                                + "\nEmail: " + usuario.getEmail()
                                + "\nContraseña: " + usuario.getContrasena(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}

