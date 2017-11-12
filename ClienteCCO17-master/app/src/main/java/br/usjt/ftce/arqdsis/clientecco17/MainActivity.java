package br.usjt.ftce.arqdsis.clientecco17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText text;
    public static final String CHAVE = "br.usjt.ftce.arqdsis.clientecco17.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.buscar_clientes);
    }

    public void buscarCliente(View view){
        Intent intent = new Intent(this, ListarClientesActivity.class);
        String texto = text.getText().toString();
        intent.putExtra(CHAVE, texto);
        startActivity(intent);

    }
}
