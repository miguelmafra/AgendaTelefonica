package up.edu.br.agendatelefonica;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


public class AgendaFilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


        Intent it = getIntent();
        Uri data = it.getData();
        String action = it.getAction();
        String type = it.getType();

        String texto = getIntent().getData() + "" + getIntent().getData();
        EditText txtNome = (EditText) findViewById(R.id.txtNome);
        txtNome.setText(texto);




    }
}

