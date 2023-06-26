package com.example.parametros2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (EditText) findViewById(R.id.tv1);
    }

    //Metodo el boton enviar
    public void Enviar(View view){
        Intent enviar = new Intent(this, Activity2.class);
        enviar.putExtra("dato", tv1.getText().toString());
        startActivity(enviar);

    }
}